package org.example;

public class FirearmMagazine {

    private String[] bullets;

    private int capacity;

    private int loadedBullets;

    public FirearmMagazine(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }

        this.bullets = new String[capacity];
        this.capacity = capacity;
        this.loadedBullets = 0;
    }

    public void loadBullet(String bullet) {
        if (loadedBullets < capacity) {
            bullets[loadedBullets] = bullet;
            loadedBullets++;
        } else {
            System.out.println("Magazine is full");
        }
    }

    public boolean isLoaded() {
        return loadedBullets > 0;
    }

    public void shot() {
        if (loadedBullets > 0) {
            String firedBullet = bullets[loadedBullets - 1];
            System.out.println("Shot: " + firedBullet);
            loadedBullets--;

            if (loadedBullets > 0) {
                System.out.println("Next bullet: " + bullets[loadedBullets - 1]);
            } else {
                System.out.println("Empty magazine");
            }
        } else {
            throw new IllegalArgumentException("Empty magazine");
        }
    }
}
