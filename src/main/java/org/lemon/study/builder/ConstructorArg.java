package org.lemon.study.builder;

/**
 * 当 isRef 为 true 的时候，arg 表示 String 类型的 refBeanId，type 不需要设置；
 *
 * 当 isRef 为 false 的时候，arg、type 都需要设置
 *
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年04月16日 06:35:00
 */
public class ConstructorArg {
    private boolean isRef;
    private Class type;
    private Object arg;

    private ConstructorArg(Builder builder) {
        this.isRef = builder.isRef;
        this.type = builder.type;
        this.arg = builder.arg;
    }

    public static class Builder {
        private boolean isRef;
        private Class type;
        private Object arg;

        public ConstructorArg build() {
            if (arg == null) {
                throw new IllegalArgumentException("arg必须设置");
            }
            if (isRef) {
                if (!(arg instanceof String)) {
                    throw new IllegalArgumentException("arg must be an instances of String");
                }
            } else {
                if (type == null) {
                    throw new IllegalArgumentException("type必须设置");
                }
            }
            return new ConstructorArg(this);
        }

        public Builder setIsRef(boolean isRef) {
            this.isRef = isRef;
            return this;
        }

        public Builder setType(Class type) {
            this.type = type;
            return this;
        }

        public Builder setArg(Object arg) {
            this.arg = arg;
            return this;
        }
    }

    public static void main(String[] args) {
        ConstructorArg ca = new ConstructorArg.Builder()
                .setIsRef(true)
                .build();
    }
}
