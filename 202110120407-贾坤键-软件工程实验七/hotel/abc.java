package com.example.common;

public class abc {
    // User类
    public class User {
        private double discountRate;

        public User(double discountRate) {
            this.discountRate = discountRate;
        }

        public double getDiscountRate() {
            return discountRate;
        }

        public void setDiscountRate(double discountRate) {
            this.discountRate = discountRate;
        }
    }

    // NormalUser类
    public class NormalUser extends User {
        public NormalUser() {
            super(1.0);
        }
    }

    // SilverCardUser类
    public class SilverCardUser extends User {
        public SilverCardUser() {
            super(0.9);
        }
    }

    // GoldenCardUser类
    public class GoldenCardUser extends User {
        public GoldenCardUser() {
            super(0.8);
        }
    }

    // Room类
    public class Room {
        private double price;

        public Room(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

    // Reservation类
    public class Reservation {
        private User user;
        private Room room;

        public Reservation(User user, Room room) {
            this.user = user;
            this.room = room;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public Room getRoom() {
            return room;
        }

        public void setRoom(Room room) {
            this.room = room;
        }

        public double calculatePrice() {
            return room.getPrice() * user.getDiscountRate();
        }
    }
}
