package pkg;

/*
The ProduceProductMenu File
author: Sahithya Cherukuri
scheru20
SER515-Design Patterns
PTBS
 */

public class ProduceProductMenu implements ProductMenu{
    //Product[] p;
    LoadData ld = new LoadData();
    public Product[] showMenu(){
        System.out.println("Factory Pattern to get the ProduceProductMenu");
        //System.out.println("Loading the product menu");
        return ld.getProducts();
    }
    public void showAddButton(){

    }
    public void showViewButton(){

    }
    public void showRadioButton(){

    }
    public void showLabels(){

    }
    public void showComboxes(){
        
    }

}