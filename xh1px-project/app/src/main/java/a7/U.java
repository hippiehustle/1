package a7;

import g7.AbstractC0793b;
import g7.AbstractC0801j;
import g7.AbstractC0802k;
import g7.C0797f;
import g7.C0799h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes.dex */
public final class U extends AbstractC0802k {

    /* renamed from: g, reason: collision with root package name */
    public int f7950g;

    /* renamed from: h, reason: collision with root package name */
    public int f7951h;

    /* renamed from: i, reason: collision with root package name */
    public int f7952i;
    public List j;
    public T k;

    /* renamed from: l, reason: collision with root package name */
    public int f7953l;

    /* renamed from: m, reason: collision with root package name */
    public T f7954m;

    /* renamed from: n, reason: collision with root package name */
    public int f7955n;

    /* renamed from: o, reason: collision with root package name */
    public List f7956o;

    /* renamed from: p, reason: collision with root package name */
    public List f7957p;

    /* renamed from: q, reason: collision with root package name */
    public List f7958q;

    /* JADX WARN: Type inference failed for: r0v0, types: [a7.U, g7.k] */
    public static U h() {
        ?? abstractC0802k = new AbstractC0802k();
        abstractC0802k.f7951h = 6;
        List list = Collections.EMPTY_LIST;
        abstractC0802k.j = list;
        T t8 = T.f7932w;
        abstractC0802k.k = t8;
        abstractC0802k.f7954m = t8;
        abstractC0802k.f7956o = list;
        abstractC0802k.f7957p = list;
        abstractC0802k.f7958q = list;
        return abstractC0802k;
    }

    @Override // g7.AbstractC0801j
    public final AbstractC0793b c() {
        V g8 = g();
        if (g8.b()) {
            return g8;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        U h8 = h();
        h8.i(g());
        return h8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // g7.AbstractC0801j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0801j d(C0797f c0797f, C0799h c0799h) {
        V v8 = null;
        try {
            try {
                V.f7960t.getClass();
                i(new V(c0797f, c0799h));
                return this;
            } catch (InvalidProtocolBufferException e9) {
                V v9 = (V) e9.f12155d;
                try {
                    throw e9;
                } catch (Throwable th) {
                    th = th;
                    v8 = v9;
                    if (v8 != null) {
                        i(v8);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (v8 != null) {
            }
            throw th;
        }
    }

    @Override // g7.AbstractC0801j
    public final /* bridge */ /* synthetic */ AbstractC0801j e(g7.o oVar) {
        i((V) oVar);
        return this;
    }

    public final V g() {
        V v8 = new V(this);
        int i4 = this.f7950g;
        int i8 = 1;
        if ((i4 & 1) != 1) {
            i8 = 0;
        }
        v8.f7963g = this.f7951h;
        if ((i4 & 2) == 2) {
            i8 |= 2;
        }
        v8.f7964h = this.f7952i;
        if ((i4 & 4) == 4) {
            this.j = Collections.unmodifiableList(this.j);
            this.f7950g &= -5;
        }
        v8.f7965i = this.j;
        if ((i4 & 8) == 8) {
            i8 |= 4;
        }
        v8.j = this.k;
        if ((i4 & 16) == 16) {
            i8 |= 8;
        }
        v8.k = this.f7953l;
        if ((i4 & 32) == 32) {
            i8 |= 16;
        }
        v8.f7966l = this.f7954m;
        if ((i4 & 64) == 64) {
            i8 |= 32;
        }
        v8.f7967m = this.f7955n;
        if ((this.f7950g & 128) == 128) {
            this.f7956o = Collections.unmodifiableList(this.f7956o);
            this.f7950g &= -129;
        }
        v8.f7968n = this.f7956o;
        if ((this.f7950g & 256) == 256) {
            this.f7957p = Collections.unmodifiableList(this.f7957p);
            this.f7950g &= -257;
        }
        v8.f7969o = this.f7957p;
        if ((this.f7950g & 512) == 512) {
            this.f7958q = Collections.unmodifiableList(this.f7958q);
            this.f7950g &= -513;
        }
        v8.f7970p = this.f7958q;
        v8.f7962f = i8;
        return v8;
    }

    public final void i(V v8) {
        T t8;
        T t9;
        if (v8 == V.f7959s) {
            return;
        }
        int i4 = v8.f7962f;
        if ((i4 & 1) == 1) {
            int i8 = v8.f7963g;
            this.f7950g = 1 | this.f7950g;
            this.f7951h = i8;
        }
        if ((i4 & 2) == 2) {
            int i9 = v8.f7964h;
            this.f7950g = 2 | this.f7950g;
            this.f7952i = i9;
        }
        if (!v8.f7965i.isEmpty()) {
            if (this.j.isEmpty()) {
                this.j = v8.f7965i;
                this.f7950g &= -5;
            } else {
                if ((this.f7950g & 4) != 4) {
                    this.j = new ArrayList(this.j);
                    this.f7950g |= 4;
                }
                this.j.addAll(v8.f7965i);
            }
        }
        if ((v8.f7962f & 4) == 4) {
            T t10 = v8.j;
            if ((this.f7950g & 8) == 8 && (t9 = this.k) != T.f7932w) {
                S r8 = T.r(t9);
                r8.i(t10);
                this.k = r8.g();
            } else {
                this.k = t10;
            }
            this.f7950g |= 8;
        }
        int i10 = v8.f7962f;
        if ((i10 & 8) == 8) {
            int i11 = v8.k;
            this.f7950g |= 16;
            this.f7953l = i11;
        }
        if ((i10 & 16) == 16) {
            T t11 = v8.f7966l;
            if ((this.f7950g & 32) == 32 && (t8 = this.f7954m) != T.f7932w) {
                S r9 = T.r(t8);
                r9.i(t11);
                this.f7954m = r9.g();
            } else {
                this.f7954m = t11;
            }
            this.f7950g |= 32;
        }
        if ((v8.f7962f & 32) == 32) {
            int i12 = v8.f7967m;
            this.f7950g |= 64;
            this.f7955n = i12;
        }
        if (!v8.f7968n.isEmpty()) {
            if (this.f7956o.isEmpty()) {
                this.f7956o = v8.f7968n;
                this.f7950g &= -129;
            } else {
                if ((this.f7950g & 128) != 128) {
                    this.f7956o = new ArrayList(this.f7956o);
                    this.f7950g |= 128;
                }
                this.f7956o.addAll(v8.f7968n);
            }
        }
        if (!v8.f7969o.isEmpty()) {
            if (this.f7957p.isEmpty()) {
                this.f7957p = v8.f7969o;
                this.f7950g &= -257;
            } else {
                if ((this.f7950g & 256) != 256) {
                    this.f7957p = new ArrayList(this.f7957p);
                    this.f7950g |= 256;
                }
                this.f7957p.addAll(v8.f7969o);
            }
        }
        if (!v8.f7970p.isEmpty()) {
            if (this.f7958q.isEmpty()) {
                this.f7958q = v8.f7970p;
                this.f7950g &= -513;
            } else {
                if ((this.f7950g & 512) != 512) {
                    this.f7958q = new ArrayList(this.f7958q);
                    this.f7950g |= 512;
                }
                this.f7958q.addAll(v8.f7970p);
            }
        }
        f(v8);
        this.f11240d = this.f11240d.h(v8.f7961e);
    }
}
