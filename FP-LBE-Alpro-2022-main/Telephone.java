class Telephone{
        public String number;
        public String name;
        private String password;

        public Telephone(String number, String name, String password) {
            this.number =number;
            this.name = name;
            this.setPassword(password);
        }
        public void setPassword(String password) {
            this.password = password + "*%";
        }
        public String printValue (){
            return("name = " + this.name + "\nnumber = " + this.number);
        }
    }
}