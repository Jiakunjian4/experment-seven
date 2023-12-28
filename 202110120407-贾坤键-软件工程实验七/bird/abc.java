package com.example.common;

public class abc {
    // FlyBehavior接口
    public interface FlyBehavior {
        void fly();
    }

    // SwimBehavior接口
    public interface SwimBehavior {
        void swim();
    }

    // UnableFly类实现FlyBehavior接口
    public class UnableFly implements FlyBehavior {
        @Override
        public void fly() {
            System.out.println("扑腾几下飞不起来...");
        }
    }

    // AbleSwim类实现SwimBehavior接口
    public class AbleSwim implements SwimBehavior {
        @Override
        public void swim() {
            System.out.println("鱼翔浅底...");
        }
    }

    // UnableSwim类实现SwimBehavior接口
    public class UnableSwim implements SwimBehavior {
        @Override
        public void swim() {
            System.out.println("扑腾几下就淹死了...");
        }
    }

    // Bird类，包含FlyBehavior和SwimBehavior属性
    public abstract class Bird {
        protected FlyBehavior flyBehavior;
        protected SwimBehavior swimBehavior;

        public Bird(FlyBehavior flyBehavior, SwimBehavior swimBehavior) {
            this.flyBehavior = flyBehavior;
            this.swimBehavior = swimBehavior;
        }

        public abstract void display();
    }

    // Eagle类继承Bird类
    public class Eagle extends Bird {
        public Eagle() {
            super(new UnableFly(), new UnableSwim());
        }

        @Override
        public void display() {
            System.out.println("This is an eagle.");
        }
    }

    // Penguin类继承Bird类
    public class Penguin extends Bird {
        public Penguin() {
            super(new UnableFly(), new AbleSwim());
        }

        @Override
        public void display() {
            System.out.println("This is a penguin.");
        }
    }

    // Client类测试以上代码
    public class Client {
        public void main(String[] args) {
            Bird eagle = new Eagle();
            eagle.display();
            eagle.flyBehavior.fly();
            eagle.swimBehavior.swim();

            Bird penguin = new Penguin();
            penguin.display();
            penguin.flyBehavior.fly();
            penguin.swimBehavior.swim();
        }
    }
}
