package com.larrykim;

import java.util.Objects;

//뉴욕 피자
public class NyPizza extends Pizza{
    public enum Size { SMALL, MEDIUM, LARGE }
    private final Size size;
    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;
        public Builder(Size size) { //사이즈 필수 매개변수
            this.size = Objects.requireNonNull(size);
        }
        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            //공변 반환 타이핑(covariant return typing)
            //클라이언트가 형 변환에 신경 쓰지 않고도 빌더를 사용할 수 있다.
            return this;
        }
    }
    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    @Override
    public String toString() {
        return "NyPizza{" +
                "size=" + size +
                ", toppings=" + toppings +
                '}';
    }
}