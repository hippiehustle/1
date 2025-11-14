package d7;

import g7.AbstractC0793b;
import g7.AbstractC0801j;
import g7.C0797f;
import g7.C0799h;
import g7.o;
import g7.u;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes.dex */
public final class d extends AbstractC0801j implements u {

    /* renamed from: e, reason: collision with root package name */
    public int f10467e;

    /* renamed from: f, reason: collision with root package name */
    public b f10468f;

    /* renamed from: g, reason: collision with root package name */
    public c f10469g;

    /* renamed from: h, reason: collision with root package name */
    public c f10470h;

    /* renamed from: i, reason: collision with root package name */
    public c f10471i;
    public c j;

    /* JADX WARN: Type inference failed for: r0v0, types: [g7.j, d7.d] */
    public static d g() {
        ?? abstractC0801j = new AbstractC0801j();
        abstractC0801j.f10468f = b.j;
        c cVar = c.j;
        abstractC0801j.f10469g = cVar;
        abstractC0801j.f10470h = cVar;
        abstractC0801j.f10471i = cVar;
        abstractC0801j.j = cVar;
        return abstractC0801j;
    }

    @Override // g7.AbstractC0801j
    public final AbstractC0793b c() {
        e f8 = f();
        f8.b();
        return f8;
    }

    public final Object clone() {
        d g8 = g();
        g8.h(f());
        return g8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // g7.AbstractC0801j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0801j d(C0797f c0797f, C0799h c0799h) {
        e eVar = null;
        try {
            try {
                e.f10473n.getClass();
                h(new e(c0797f, c0799h));
                return this;
            } catch (InvalidProtocolBufferException e9) {
                e eVar2 = (e) e9.f12155d;
                try {
                    throw e9;
                } catch (Throwable th) {
                    th = th;
                    eVar = eVar2;
                    if (eVar != null) {
                        h(eVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (eVar != null) {
            }
            throw th;
        }
    }

    @Override // g7.AbstractC0801j
    public final /* bridge */ /* synthetic */ AbstractC0801j e(o oVar) {
        h((e) oVar);
        return this;
    }

    public final e f() {
        e eVar = new e(this);
        int i4 = this.f10467e;
        int i8 = 1;
        if ((i4 & 1) != 1) {
            i8 = 0;
        }
        eVar.f10476f = this.f10468f;
        if ((i4 & 2) == 2) {
            i8 |= 2;
        }
        eVar.f10477g = this.f10469g;
        if ((i4 & 4) == 4) {
            i8 |= 4;
        }
        eVar.f10478h = this.f10470h;
        if ((i4 & 8) == 8) {
            i8 |= 8;
        }
        eVar.f10479i = this.f10471i;
        if ((i4 & 16) == 16) {
            i8 |= 16;
        }
        eVar.j = this.j;
        eVar.f10475e = i8;
        return eVar;
    }

    public final void h(e eVar) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        b bVar;
        if (eVar == e.f10472m) {
            return;
        }
        if ((eVar.f10475e & 1) == 1) {
            b bVar2 = eVar.f10476f;
            if ((this.f10467e & 1) == 1 && (bVar = this.f10468f) != b.j) {
                a aVar = new a(0);
                aVar.h(bVar);
                aVar.h(bVar2);
                this.f10468f = aVar.f();
            } else {
                this.f10468f = bVar2;
            }
            this.f10467e |= 1;
        }
        if ((eVar.f10475e & 2) == 2) {
            c cVar5 = eVar.f10477g;
            if ((this.f10467e & 2) == 2 && (cVar4 = this.f10469g) != c.j) {
                a i4 = c.i(cVar4);
                i4.i(cVar5);
                this.f10469g = i4.g();
            } else {
                this.f10469g = cVar5;
            }
            this.f10467e |= 2;
        }
        if (eVar.i()) {
            c cVar6 = eVar.f10478h;
            if ((this.f10467e & 4) == 4 && (cVar3 = this.f10470h) != c.j) {
                a i8 = c.i(cVar3);
                i8.i(cVar6);
                this.f10470h = i8.g();
            } else {
                this.f10470h = cVar6;
            }
            this.f10467e |= 4;
        }
        if ((eVar.f10475e & 8) == 8) {
            c cVar7 = eVar.f10479i;
            if ((this.f10467e & 8) == 8 && (cVar2 = this.f10471i) != c.j) {
                a i9 = c.i(cVar2);
                i9.i(cVar7);
                this.f10471i = i9.g();
            } else {
                this.f10471i = cVar7;
            }
            this.f10467e |= 8;
        }
        if ((eVar.f10475e & 16) == 16) {
            c cVar8 = eVar.j;
            if ((this.f10467e & 16) == 16 && (cVar = this.j) != c.j) {
                a i10 = c.i(cVar);
                i10.i(cVar8);
                this.j = i10.g();
            } else {
                this.j = cVar8;
            }
            this.f10467e |= 16;
        }
        this.f11240d = this.f11240d.h(eVar.f10474d);
    }
}
