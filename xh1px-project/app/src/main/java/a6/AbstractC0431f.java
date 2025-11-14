package a6;

import java.util.AbstractSet;
import java.util.Set;
import p6.InterfaceC1318d;

/* renamed from: a6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0431f extends AbstractSet implements Set, InterfaceC1318d {
    public abstract int g();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return g();
    }
}
