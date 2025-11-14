package g7;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class r extends AbstractList implements RandomAccess, s {

    /* renamed from: e, reason: collision with root package name */
    public static final G f11253e = new G(new r());

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f11254d;

    public r() {
        this.f11254d = new ArrayList();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        this.f11254d.add(i4, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f11254d.size(), collection);
    }

    @Override // g7.s
    public final void b(t tVar) {
        this.f11254d.add(tVar);
        ((AbstractList) this).modCount++;
    }

    @Override // g7.s
    public final AbstractC0796e c(int i4) {
        AbstractC0796e tVar;
        ArrayList arrayList = this.f11254d;
        Object obj = arrayList.get(i4);
        if (obj instanceof AbstractC0796e) {
            tVar = (AbstractC0796e) obj;
        } else if (obj instanceof String) {
            try {
                tVar = new t(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e9) {
                throw new RuntimeException("UTF-8 not supported?", e9);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            tVar = new t(bArr2);
        }
        if (tVar != obj) {
            arrayList.set(i4, tVar);
        }
        return tVar;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f11254d.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // g7.s
    public final G d() {
        return new G(this);
    }

    @Override // g7.s
    public final List f() {
        return Collections.unmodifiableList(this.f11254d);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        ArrayList arrayList = this.f11254d;
        Object obj = arrayList.get(i4);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC0796e) {
            AbstractC0796e abstractC0796e = (AbstractC0796e) obj;
            String s8 = abstractC0796e.s();
            if (abstractC0796e.m()) {
                arrayList.set(i4, s8);
            }
            return s8;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = q.f11252a;
        try {
            String str = new String(bArr, "UTF-8");
            if (C.c(bArr, 0, bArr.length) == 0) {
                arrayList.set(i4, str);
            }
            return str;
        } catch (UnsupportedEncodingException e9) {
            throw new RuntimeException("UTF-8 not supported?", e9);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        Object remove = this.f11254d.remove(i4);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof AbstractC0796e) {
            return ((AbstractC0796e) remove).s();
        }
        byte[] bArr = (byte[]) remove;
        byte[] bArr2 = q.f11252a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e9) {
            throw new RuntimeException("UTF-8 not supported?", e9);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        Object obj2 = this.f11254d.set(i4, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof AbstractC0796e) {
            return ((AbstractC0796e) obj2).s();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = q.f11252a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e9) {
            throw new RuntimeException("UTF-8 not supported?", e9);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11254d.size();
    }

    public r(s sVar) {
        this.f11254d = new ArrayList(sVar.size());
        addAll(sVar);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection collection) {
        if (collection instanceof s) {
            collection = ((s) collection).f();
        }
        boolean addAll = this.f11254d.addAll(i4, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
