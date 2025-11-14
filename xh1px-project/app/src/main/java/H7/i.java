package H7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;
import p6.InterfaceC1315a;

/* loaded from: classes.dex */
public final class i implements Iterator, InterfaceC1315a {

    /* renamed from: d, reason: collision with root package name */
    public Object f2063d;

    /* renamed from: e, reason: collision with root package name */
    public int f2064e = -2;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f2065f;

    public i(j jVar) {
        this.f2065f = jVar;
    }

    public final void b() {
        Object m6;
        int i4;
        int i8 = this.f2064e;
        j jVar = this.f2065f;
        if (i8 == -2) {
            m6 = ((InterfaceC1162a) jVar.f2068c).a();
        } else {
            InterfaceC1163b interfaceC1163b = (InterfaceC1163b) jVar.f2067b;
            Object obj = this.f2063d;
            o6.j.b(obj);
            m6 = interfaceC1163b.m(obj);
        }
        this.f2063d = m6;
        if (m6 == null) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        this.f2064e = i4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2064e < 0) {
            b();
        }
        if (this.f2064e == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2064e < 0) {
            b();
        }
        if (this.f2064e != 0) {
            Object obj = this.f2063d;
            o6.j.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f2064e = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
