package d7;

import g7.AbstractC0793b;
import g7.AbstractC0801j;
import g7.C0797f;
import g7.C0799h;
import g7.o;
import g7.u;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes.dex */
public final class a extends AbstractC0801j implements u {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10451e;

    /* renamed from: f, reason: collision with root package name */
    public int f10452f;

    /* renamed from: g, reason: collision with root package name */
    public int f10453g;

    /* renamed from: h, reason: collision with root package name */
    public int f10454h;

    public /* synthetic */ a(int i4) {
        this.f10451e = i4;
    }

    @Override // g7.AbstractC0801j
    public final AbstractC0793b c() {
        switch (this.f10451e) {
            case 0:
                b f8 = f();
                f8.b();
                return f8;
            default:
                c g8 = g();
                g8.b();
                return g8;
        }
    }

    public final Object clone() {
        switch (this.f10451e) {
            case 0:
                a aVar = new a(0);
                aVar.h(f());
                return aVar;
            default:
                a aVar2 = new a(1);
                aVar2.i(g());
                return aVar2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    @Override // g7.AbstractC0801j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0801j d(C0797f c0797f, C0799h c0799h) {
        switch (this.f10451e) {
            case 0:
                b bVar = null;
                try {
                    try {
                        b.k.getClass();
                        h(new b(c0797f));
                        return this;
                    } catch (InvalidProtocolBufferException e9) {
                        b bVar2 = (b) e9.f12155d;
                        try {
                            throw e9;
                        } catch (Throwable th) {
                            th = th;
                            bVar = bVar2;
                            if (bVar != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bVar != null) {
                        h(bVar);
                    }
                    throw th;
                }
            default:
                c cVar = null;
                try {
                    try {
                        c.k.getClass();
                        i(new c(c0797f));
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        c cVar2 = (c) e10.f12155d;
                        try {
                            throw e10;
                        } catch (Throwable th3) {
                            th = th3;
                            cVar = cVar2;
                            if (cVar != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (cVar != null) {
                        i(cVar);
                    }
                    throw th;
                }
        }
    }

    @Override // g7.AbstractC0801j
    public final /* bridge */ /* synthetic */ AbstractC0801j e(o oVar) {
        switch (this.f10451e) {
            case 0:
                h((b) oVar);
                return this;
            default:
                i((c) oVar);
                return this;
        }
    }

    public b f() {
        b bVar = new b(this);
        int i4 = this.f10452f;
        int i8 = 1;
        if ((i4 & 1) != 1) {
            i8 = 0;
        }
        bVar.f10457f = this.f10453g;
        if ((i4 & 2) == 2) {
            i8 |= 2;
        }
        bVar.f10458g = this.f10454h;
        bVar.f10456e = i8;
        return bVar;
    }

    public c g() {
        c cVar = new c(this);
        int i4 = this.f10452f;
        int i8 = 1;
        if ((i4 & 1) != 1) {
            i8 = 0;
        }
        cVar.f10463f = this.f10453g;
        if ((i4 & 2) == 2) {
            i8 |= 2;
        }
        cVar.f10464g = this.f10454h;
        cVar.f10462e = i8;
        return cVar;
    }

    public void h(b bVar) {
        if (bVar == b.j) {
            return;
        }
        int i4 = bVar.f10456e;
        if ((i4 & 1) == 1) {
            int i8 = bVar.f10457f;
            this.f10452f = 1 | this.f10452f;
            this.f10453g = i8;
        }
        if ((i4 & 2) == 2) {
            int i9 = bVar.f10458g;
            this.f10452f = 2 | this.f10452f;
            this.f10454h = i9;
        }
        this.f11240d = this.f11240d.h(bVar.f10455d);
    }

    public void i(c cVar) {
        if (cVar == c.j) {
            return;
        }
        int i4 = cVar.f10462e;
        if ((i4 & 1) == 1) {
            int i8 = cVar.f10463f;
            this.f10452f = 1 | this.f10452f;
            this.f10453g = i8;
        }
        if ((i4 & 2) == 2) {
            int i9 = cVar.f10464g;
            this.f10452f = 2 | this.f10452f;
            this.f10454h = i9;
        }
        this.f11240d = this.f11240d.h(cVar.f10461d);
    }
}
