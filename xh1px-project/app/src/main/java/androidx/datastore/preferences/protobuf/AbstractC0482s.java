package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0482s implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0484u f8740d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC0484u f8741e;

    public AbstractC0482s(AbstractC0484u abstractC0484u) {
        this.f8740d = abstractC0484u;
        if (!abstractC0484u.g()) {
            this.f8741e = abstractC0484u.i();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public final AbstractC0484u a() {
        AbstractC0484u b4 = b();
        b4.getClass();
        if (AbstractC0484u.f(b4, true)) {
            return b4;
        }
        throw new UninitializedMessageException();
    }

    public final AbstractC0484u b() {
        if (!this.f8741e.g()) {
            return this.f8741e;
        }
        AbstractC0484u abstractC0484u = this.f8741e;
        abstractC0484u.getClass();
        O o7 = O.f8627c;
        o7.getClass();
        o7.a(abstractC0484u.getClass()).d(abstractC0484u);
        abstractC0484u.h();
        return this.f8741e;
    }

    public final void c() {
        if (!this.f8741e.g()) {
            AbstractC0484u i4 = this.f8740d.i();
            AbstractC0484u abstractC0484u = this.f8741e;
            O o7 = O.f8627c;
            o7.getClass();
            o7.a(i4.getClass()).a(i4, abstractC0484u);
            this.f8741e = i4;
        }
    }

    public final Object clone() {
        AbstractC0482s abstractC0482s = (AbstractC0482s) this.f8740d.c(5);
        abstractC0482s.f8741e = b();
        return abstractC0482s;
    }
}
