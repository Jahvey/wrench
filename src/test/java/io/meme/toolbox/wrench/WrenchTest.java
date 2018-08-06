package io.meme.toolbox.wrench;

import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.tree.ClassNode;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.Serializable;
import java.util.*;

class WrenchTest {

    @Test
    void scan() throws IOException {
        ClassReader classReader = new ClassReader("java.lang.Integer");
        ClassNode classVisitor = new ClassNode();
        classReader.accept(classVisitor, 0);
        Result scan = Wrench.wrench().includePackages("io.vavr", "java.lang").scan();
        System.in.read();
    }

}

class A extends B implements Serializable, List<Date> {

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Date> iterator() {
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
    public boolean add(Date date) {
        return false;
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
    public boolean addAll(Collection<? extends Date> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Date> c) {
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
    public Date get(int index) {
        return null;
    }

    @Override
    public Date set(int index, Date element) {
        return null;
    }

    @Override
    public void add(int index, Date element) {

    }

    @Override
    public Date remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Date> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Date> listIterator(int index) {
        return null;
    }

    @Override
    public List<Date> subList(int fromIndex, int toIndex) {
        return null;
    }
}

class B implements C {

}

interface C extends Serializable {

}