package com.org.ticketor.dicts;

public enum PrivilegeLevelEnum {
    BASIC("Basic"),

    MEDIUM("Medio"),
    VIP("Vip");

    private final String privilegeLevel;

    private PrivilegeLevelEnum(String privilegeLevel){
        this.privilegeLevel = privilegeLevel;
    }

    public String getAcessLevel(){
        return this.privilegeLevel;
    }
}
