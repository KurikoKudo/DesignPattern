package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory implements DirectoryEntry{
    private List<DirectoryEntry> list = null;
    private String name = null;
    public Directory(String name){
        this.name = name;
        list = new ArrayList<DirectoryEntry>();
    }
    public void add(DirectoryEntry entry){
        list.add(entry);
    }
    public void remove(){
        Iterator<DirectoryEntry> itr = list.iterator();
        while(itr.hasNext()){
            DirectoryEntry entry = itr.next();
            entry.remove();
        }
        System.out.println(name + "を削除しました。");
    }
}