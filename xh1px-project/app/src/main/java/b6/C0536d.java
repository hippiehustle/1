package b6;

import P.C;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o6.j;
import p6.InterfaceC1315a;

/* renamed from: b6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0536d extends C implements Iterator, InterfaceC1315a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9221h;

    public C0536d(C0538f c0538f, int i4) {
        this.f9221h = i4;
        j.e(c0538f, "map");
        this.f4206g = c0538f;
        this.f4204e = -1;
        this.f4205f = c0538f.k;
        g();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9221h) {
            case 0:
                c();
                int i4 = this.f4203d;
                C0538f c0538f = (C0538f) this.f4206g;
                if (i4 < c0538f.f9231i) {
                    this.f4203d = i4 + 1;
                    this.f4204e = i4;
                    C0537e c0537e = new C0537e(c0538f, i4);
                    g();
                    return c0537e;
                }
                throw new NoSuchElementException();
            case 1:
                c();
                int i8 = this.f4203d;
                C0538f c0538f2 = (C0538f) this.f4206g;
                if (i8 < c0538f2.f9231i) {
                    this.f4203d = i8 + 1;
                    this.f4204e = i8;
                    Object obj = c0538f2.f9226d[i8];
                    g();
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                c();
                int i9 = this.f4203d;
                C0538f c0538f3 = (C0538f) this.f4206g;
                if (i9 < c0538f3.f9231i) {
                    this.f4203d = i9 + 1;
                    this.f4204e = i9;
                    Object[] objArr = c0538f3.f9227e;
                    j.b(objArr);
                    Object obj2 = objArr[this.f4204e];
                    g();
                    return obj2;
                }
                throw new NoSuchElementException();
        }
    }
}
