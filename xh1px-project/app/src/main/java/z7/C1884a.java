package z7;

import java.util.ArrayList;
import w7.M;

/* renamed from: z7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1884a extends ArrayList implements InterfaceC1890g {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof M)) {
            return false;
        }
        return super.contains((M) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof M)) {
            return -1;
        }
        return super.indexOf((M) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof M)) {
            return -1;
        }
        return super.lastIndexOf((M) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof M)) {
            return false;
        }
        return super.remove((M) obj);
    }
}
