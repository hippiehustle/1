package g7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: g7.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0803l extends o {

    /* renamed from: d, reason: collision with root package name */
    public final C0800i f11243d;

    public AbstractC0803l() {
        this.f11243d = new C0800i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i() {
        z zVar = this.f11243d.f11238a;
        int i4 = 0;
        while (true) {
            if (i4 < zVar.f11269e.size()) {
                if (!C0800i.e((Map.Entry) zVar.f11269e.get(i4))) {
                    break;
                }
                i4++;
            } else {
                Iterator it = zVar.c().iterator();
                while (it.hasNext()) {
                    if (!C0800i.e((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
        }
    }

    public final int j() {
        z zVar = this.f11243d.f11238a;
        int i4 = 0;
        for (int i8 = 0; i8 < zVar.f11269e.size(); i8++) {
            Map.Entry entry = (Map.Entry) zVar.f11269e.get(i8);
            i4 += C0800i.d((C0804m) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : zVar.c()) {
            i4 += C0800i.d((C0804m) entry2.getKey(), entry2.getValue());
        }
        return i4;
    }

    public final Object k(n nVar) {
        o(nVar);
        C0804m c0804m = nVar.f11250d;
        Object obj = this.f11243d.f11238a.get(c0804m);
        if (obj == null) {
            return nVar.f11248b;
        }
        if (c0804m.f11246f) {
            if (c0804m.f11245e.f11205d == M.ENUM) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(nVar.a(it.next()));
                }
                return arrayList;
            }
            return obj;
        }
        return nVar.a(obj);
    }

    public final boolean l(n nVar) {
        o(nVar);
        C0804m c0804m = nVar.f11250d;
        C0800i c0800i = this.f11243d;
        c0800i.getClass();
        if (!c0804m.f11246f) {
            if (c0800i.f11238a.get(c0804m) != null) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    public final void m() {
        this.f11243d.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(C0797f c0797f, L5.m mVar, C0799h c0799h, int i4) {
        boolean z8;
        boolean z9;
        Object c6;
        AbstractC0793b abstractC0793b;
        int i8 = i4 & 7;
        n nVar = (n) c0799h.f11236a.get(new C0798g(i4 >>> 3, a()));
        if (nVar != null) {
            C0804m c0804m = nVar.f11250d;
            L l6 = c0804m.f11245e;
            C0800i c0800i = C0800i.f11237c;
            if (i8 == l6.f11206e) {
                z9 = false;
                z8 = false;
            } else if (c0804m.f11246f && l6.a() && i8 == 2) {
                z8 = true;
                z9 = false;
            }
            if (!z9) {
                return c0797f.q(i4, mVar);
            }
            AbstractC0801j abstractC0801j = null;
            C0800i c0800i2 = this.f11243d;
            if (z8) {
                int d2 = c0797f.d(c0797f.k());
                C0804m c0804m2 = nVar.f11250d;
                if (c0804m2.f11245e == L.j) {
                    if (c0797f.b() > 0) {
                        c0797f.k();
                        throw null;
                    }
                } else {
                    while (c0797f.b() > 0) {
                        c0800i2.a(c0804m2, C0800i.h(c0797f, c0804m2.f11245e));
                    }
                }
                c0797f.c(d2);
                return true;
            }
            C0804m c0804m3 = nVar.f11250d;
            L l8 = c0804m3.f11245e;
            boolean z10 = c0804m3.f11246f;
            int ordinal = l8.f11205d.ordinal();
            if (ordinal != 7) {
                if (ordinal != 8) {
                    c6 = C0800i.h(c0797f, l8);
                } else {
                    if (!z10 && (abstractC0793b = (AbstractC0793b) c0800i2.f11238a.get(c0804m3)) != null) {
                        abstractC0801j = abstractC0793b.e();
                    }
                    if (abstractC0801j == null) {
                        abstractC0801j = nVar.f11249c.d();
                    }
                    if (l8 == L.f11203h) {
                        int i9 = c0804m3.f11244d;
                        int i10 = c0797f.f11232i;
                        if (i10 < 64) {
                            c0797f.f11232i = i10 + 1;
                            abstractC0801j.d(c0797f, c0799h);
                            c0797f.a((i9 << 3) | 4);
                            c0797f.f11232i--;
                        } else {
                            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                        }
                    } else {
                        int k = c0797f.k();
                        if (c0797f.f11232i < 64) {
                            int d3 = c0797f.d(k);
                            c0797f.f11232i++;
                            abstractC0801j.d(c0797f, c0799h);
                            c0797f.a(0);
                            c0797f.f11232i--;
                            c0797f.c(d3);
                        } else {
                            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                        }
                    }
                    c6 = abstractC0801j.c();
                }
                if (z10) {
                    c0800i2.a(c0804m3, nVar.b(c6));
                    return true;
                }
                c0800i2.i(c0804m3, nVar.b(c6));
                return true;
            }
            c0797f.k();
            throw null;
        }
        z9 = true;
        z8 = false;
        if (!z9) {
        }
    }

    public final void o(n nVar) {
        if (nVar.f11247a == a()) {
        } else {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public AbstractC0803l(AbstractC0802k abstractC0802k) {
        abstractC0802k.f11241e.f();
        abstractC0802k.f11242f = false;
        this.f11243d = abstractC0802k.f11241e;
    }
}
