package a6;

import java.util.AbstractList;
import java.util.List;
import p6.InterfaceC1316b;

/* renamed from: a6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0430e extends AbstractList implements List, InterfaceC1316b {
    public abstract int g();

    public abstract Object h(int i4);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i4) {
        return h(i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return g();
    }
}
