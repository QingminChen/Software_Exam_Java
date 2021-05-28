package com.qingmin3;

class Light {
     private String name;
     public Light(){};
     public Light(String name){
         this.name=name;
     }
     public void on(){
         System.out.println("The light is on");
     }

     public void off(){
         System.out.println("The light is off");
     }


}
