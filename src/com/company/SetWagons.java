/*package com.company;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class SetWagons implements Set<Node<Wagon>> {
    private Wagon[] arr;
    private IteratorWagon it;

    class IteratorWagon implements Iterator<Wagon> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return (index + 1) < arr.length;
        }

        @Override
        public Wagon next() {
            return arr[index + 1];
        }
    }

    public SetWagons(){
        arr = new Wagon[0];
        it = new IteratorWagon();
    }

    public SetWagons(Wagon wagon){
        arr = new Wagon[1];
        arr[0] = wagon;
    }

    public SetWagons(ArrayList<Wagon> wagones){
        if (wagones == null)
            throw new NullPointerException("Null in constructor!");

        for (Wagon wg: wagones){
            add(wg);
        }
    }

    @Override
    public int size() {
        return arr.length;
    }

    @Override
    public boolean isEmpty() {
        return (arr.length > 0) ? false : true;
    }

    @Override
    public boolean contains(Object o) {
        Wagon wg = (Wagon) o;

        for (int i = 0; i < arr.length; i++){
            if (arr[i].getNumberWag()==wg.getNumberWag() &&
                    arr[i].getPeople() == wg.getPeople() &&
                    arr[i].getComfort() == wg.getComfort() &&
                    arr[i].getLuggage() == wg.getLuggage())
                return true;
        }
        return false;
    }

    @Override
    public Iterator<Wagon> iterator() {
        return it;
    }

    @Override
    public Object[] toArray() {
        return arr;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return (T[])arr;
    }

    @Override
    public boolean add(Node<Wagon> wagonNode) {
        return false;
    }

    @Override
    public boolean add(Wagon wagon) {

        int startLength = 0;
        try {
            startLength = arr.length;
        } catch (NullPointerException e){
            System.out.println("Set collection is null");
        }

        Wagon[] res = new Wagon[startLength + 1];

        for (int i = 0; i < startLength; i++){
            res[i] = arr[i];
        }
        res[startLength] = wagon;
        arr = res;

        return true;
    }

    @Override
    public boolean remove(Object o) {
        SetWagons res = new SetWagons();

        int k = 0;

        Wagon wg = (Wagon)o;

        try {
            if (arr.length > 1) {
                for (int i = 0; i < arr.length - k; i++) {
                    if (arr[i].getNumberWag()==wg.getNumberWag() &&
                            arr[i].getPeople() == wg.getPeople() &&
                            arr[i].getComfort() == wg.getComfort() &&
                            arr[i].getLuggage() == wg.getLuggage()
                            ) {
                        k++;
                    }

                    res.add(arr[i + k]);
                }
            }
        }catch(NullPointerException e){
            System.out.println("Set collection is null");
        }

        arr = res.getWagons();
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {

        try {
            for (Object obj : c) {
                if (!contains(obj))
                    return false;
            }
        } catch(NullPointerException e) {
            System.out.println("Contains all collection is null");
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends Node<Wagon>> c) {
        try {
            for (Object obj : c) {
                if (!add((Wagon) obj))
                    return false;
            }
        }catch (NullPointerException e){
            System.out.println("add all collection is null");
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        ArrayList<Wagon> stonesToDelete = new ArrayList<>();

        try {

            for (Wagon wg : arr) {
                if (!c.contains(wg))
                    stonesToDelete.add(wg);
            }

            removeAll(stonesToDelete);
        }catch(NullPointerException e){
            System.out.println("add all collection is null");
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        for(Object obj: c){
            if (!remove(obj))
                return false;
        }

        return true;
    }

    @Override
    public void clear() {
        arr = new Wagon[0];
    }

    public void print(){
        System.out.println("Length of array: " + arr.length);

        try {
            for (Wagon wg : arr) {
                wg.print();
            }
        }catch (NullPointerException e){
            System.out.println("Set collection is null");
        }
    }

    public void increaseThirtyPercentArraySize() {
        int newLength = (int)Math.round(arr.length * 0.3);
        for (int i = 0; i < newLength; i++){
            add(arr[i]);
        }
    }

    public void initSetByDefaultValues() {
        add(new WagonSit(143,3,6,34,23));
        add(new WagonSit(143,3,5,34,23));
        add(new WagonSleep(143,4,57,56,34));
        add(new WagonSit(143,3,3,34,23));
        add(new WagonSleep(143,3,4,34,65));
        add(new WagonSit(143,3,2,34,233));
        add(new WagonSleep(143,3,1,3335,4));
    }

    public Wagon[] getWagons(){
        return arr;
    }

    public Wagon[] getArr(){return arr;}

    public void setArr(Wagon[] arr){
        this.arr = arr;
    }

    public IteratorWagon getIt(){
        return it;
    }

    public void setIt(IteratorWagon it){
        this.it = it;
    }
}
*/