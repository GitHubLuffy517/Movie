package com.lxd.movie.bean;

public class Type {
    private int TypeId;
    private String TypeName;

    public int getTypeId() {
        return TypeId;
    }

    @Override
    public String toString() {
        return "Type{" +
                "TypeId=" + TypeId +
                ", TypeName='" + TypeName + '\'' +
                '}';
    }

    public void setTypeId(int typeId) {
        TypeId = typeId;
    }

    public String getTypeName() {
        return TypeName;
    }

    public void setTypeName(String typeName) {
        TypeName = typeName;
    }
}
