public class learsearch_menu {

    public static int Menu_Linear_Search(String menu[], String key){
        for(int i=0; i<menu.length; i++){
            if(menu[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String menu[] = {"Sandwitch","Pizza", "Burgar", "Edali", "Dhosa", "Samosa", "Cachori", "Dabeli" };
        String key = "Samosa";

        int index = Menu_Linear_Search(menu, key);

        if(index==-1){
            System.out.println("NOT Found!");
        }else{
            System.out.println("Key is at index "+index);
        }
    }
}
