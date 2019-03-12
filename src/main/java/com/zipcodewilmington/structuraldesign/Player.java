package com.zipcodewilmington.structuraldesign;

public class Player implements ProfileInterface {
    private ProfileInterface profile;

    public Player(ProfileInterface profile) {
        this(profile.getId(), profile.getName(), profile.getBalance());
    }

    public Player(Integer id, String name, Double balance) {
        this.setId(id);
        this.setName(name);
        this.setBalance(balance);
    }

    @Override
    public Integer getId() {
        return this.profile.getId();
    }

    @Override
    public void setId(Integer id) {
        this.profile.setId(id);
    }

    @Override
    public String getName() {
        return this.profile.getName();
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public Double getBalance() {
        return this.profile.getBalance();
    }

    @Override
    public void setBalance(Double balance) {

    }
}
