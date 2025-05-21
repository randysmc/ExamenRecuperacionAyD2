package org.example.Refactor;


/*
* AQUI UTILIZAMOS BUILDER PORQUE NOS PERMITE PODER CREAR OBJETOS DE MANERA DINAMICA
* CUANDO TENEMOS MUCHOS ATRIBUTOS
* */
public class User {
    private final String name;
    private final String email;
    private final String phone;
    private final String address;
    private final String city;
    private final String zip;

    private User(Builder builder){
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
        this.city = builder.city;
        this.zip = builder.zip;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public static class Builder{
        private String name;
        private String email;
        private String phone;
        private String address;
        private String city;
        private String zip;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder zip(String zip) {
            this.zip = zip;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
