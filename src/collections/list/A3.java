package collections.list;
import java.util.*;
import java.util.function.Predicate;

public class A3 {
    public static void main(String[] args){
        Deque<Integer> list = new Deque<>() {

            @Override
            public void addFirst(Integer integer) {

            }

            @Override
            public void addLast(Integer integer) {

            }

            @Override
            public boolean offerFirst(Integer integer) {
                return false;
            }

            @Override
            public boolean offerLast(Integer integer) {
                return false;
            }

            @Override
            public Integer removeFirst() {
                return 0;
            }

            @Override
            public Integer removeLast() {
                return 0;
            }

            @Override
            public Integer pollFirst() {
                return 0;
            }

            @Override
            public Integer pollLast() {
                return 0;
            }

            @Override
            public Integer getFirst() {
                return 0;
            }

            @Override
            public Integer getLast() {
                return 0;
            }

            @Override
            public Integer peekFirst() {
                return 0;
            }

            @Override
            public Integer peekLast() {
                return 0;
            }

            @Override
            public boolean removeFirstOccurrence(Object o) {
                return false;
            }

            @Override
            public boolean removeLastOccurrence(Object o) {
                return false;
            }

            @Override
            public boolean add(Integer integer) {
                return false;
            }

            @Override
            public boolean offer(Integer integer) {
                return false;
            }

            @Override
            public Integer remove() {
                return 0;
            }

            @Override
            public Integer poll() {
                return 0;
            }

            @Override
            public Integer element() {
                return 0;
            }

            @Override
            public Integer peek() {
                return 0;
            }

            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public void push(Integer integer) {

            }

            @Override
            public Integer pop() {
                return 0;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public Iterator<Integer> descendingIterator() {
                return null;
            }
        };
        list.push(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.pop();
        System.out.println(list);
    }
}
