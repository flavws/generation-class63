public class Client {
        private String name;
        private Long zipcode;
        private String email;
        private String phone;
        private String address;

        public Client(String name, Long zipcode, String email, String phone, String address){
            this.name = name;
            this.zipcode = zipcode;
            this.email = email;
            this.phone = phone;
            this.address = address;
        }

        public String getName(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        }

        public Long getZipcode(){
            return this.zipcode;
        }

        public void setZipcode(Long zipcode){
            this.zipcode = zipcode;
        }

        public String getEmail(){
            return this.email;
        }

        public void setEmail(){
            this.email = email;
        }

        public String getPhone(){
            return this.phone;
        }

        public void setPhone(String phone){
            this.phone = phone;
        }

        public String getAddress(){
            return this.address;
        }

        public void setAddress(String address){
            this.address = address;
        }

        public void view(){
            System.out.println("Dados do cliente: \n" + name + "\n" + zipcode + "\n" + email + "\n" + phone + "\n" + address);
        }

}
