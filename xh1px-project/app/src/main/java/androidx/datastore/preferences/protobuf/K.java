package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class K implements S {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0465a f8622a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f8623b;

    /* renamed from: c, reason: collision with root package name */
    public final C0478n f8624c;

    public K(Y y4, C0478n c0478n, AbstractC0465a abstractC0465a) {
        this.f8623b = y4;
        c0478n.getClass();
        this.f8624c = c0478n;
        this.f8622a = abstractC0465a;
    }

    @Override // androidx.datastore.preferences.protobuf.S
    public final void a(Object obj, Object obj2) {
        T.k(this.f8623b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.S
    public final void b(Object obj, B b4) {
        this.f8624c.getClass();
        A.j.w(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.S
    public final int c(AbstractC0484u abstractC0484u) {
        ((a0) this.f8623b).getClass();
        return abstractC0484u.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.S
    public final void d(Object obj) {
        ((a0) this.f8623b).getClass();
        Z z8 = ((AbstractC0484u) obj).unknownFields;
        if (z8.f8661e) {
            z8.f8661e = false;
        }
        this.f8624c.getClass();
        A.j.w(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.S
    public final boolean e(Object obj) {
        this.f8624c.getClass();
        A.j.w(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.S
    public final boolean f(AbstractC0484u abstractC0484u, AbstractC0484u abstractC0484u2) {
        a0 a0Var = (a0) this.f8623b;
        a0Var.getClass();
        Z z8 = abstractC0484u.unknownFields;
        a0Var.getClass();
        if (!z8.equals(abstractC0484u2.unknownFields)) {
            return false;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.S
    public final void g(Object obj, C0474j c0474j, C0477m c0477m) {
        this.f8623b.a(obj);
        this.f8624c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.S
    public final int h(AbstractC0484u abstractC0484u) {
        ((a0) this.f8623b).getClass();
        Z z8 = abstractC0484u.unknownFields;
        int i4 = z8.f8660d;
        if (i4 != -1) {
            return i4;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < z8.f8657a; i9++) {
            int i10 = z8.f8658b[i9] >>> 3;
            i8 += C0475k.U(3, (C0471g) z8.f8659c[i9]) + C0475k.X(i10) + C0475k.W(2) + (C0475k.W(1) * 2);
        }
        z8.f8660d = i8;
        return i8;
    }

    @Override // androidx.datastore.preferences.protobuf.S
    public final AbstractC0484u i() {
        AbstractC0465a abstractC0465a = this.f8622a;
        if (abstractC0465a instanceof AbstractC0484u) {
            return ((AbstractC0484u) abstractC0465a).i();
        }
        return ((AbstractC0482s) ((AbstractC0484u) abstractC0465a).c(5)).b();
    }
}
