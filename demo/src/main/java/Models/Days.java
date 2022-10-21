package Models;

import java.util.List;

public class Days {
    private List<String> toDoList;
    private String listName;
    private int id;

    public Days(List<String> toDoList,String listName,int id) {
        this.toDoList=toDoList;
        this.listName=listName;
        this.id=id;
    }

    public List<String> gettoDolist(){
        return toDoList;
    }
    public void setToDoList(List<String> toDoList){
        this.toDoList=toDoList;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }
}
