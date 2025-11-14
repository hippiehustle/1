package a7;

import g7.AbstractC0793b;
import g7.AbstractC0801j;
import g7.C0797f;
import g7.C0799h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: a7.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0456q extends AbstractC0801j implements g7.u {

    /* renamed from: e, reason: collision with root package name */
    public int f8205e;

    /* renamed from: f, reason: collision with root package name */
    public r f8206f;

    /* renamed from: g, reason: collision with root package name */
    public List f8207g;

    /* renamed from: h, reason: collision with root package name */
    public C0463y f8208h;

    /* renamed from: i, reason: collision with root package name */
    public EnumC0457s f8209i;

    /* JADX WARN: Type inference failed for: r0v0, types: [g7.j, a7.q] */
    public static C0456q g() {
        ?? abstractC0801j = new AbstractC0801j();
        abstractC0801j.f8206f = r.RETURNS_CONSTANT;
        abstractC0801j.f8207g = Collections.EMPTY_LIST;
        abstractC0801j.f8208h = C0463y.f8248o;
        abstractC0801j.f8209i = EnumC0457s.AT_MOST_ONCE;
        return abstractC0801j;
    }

    @Override // g7.AbstractC0801j
    public final AbstractC0793b c() {
        C0458t f8 = f();
        if (f8.b()) {
            return f8;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        C0456q g8 = g();
        g8.h(f());
        return g8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // g7.AbstractC0801j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0801j d(C0797f c0797f, C0799h c0799h) {
        C0458t c0458t = null;
        try {
            try {
                C0458t.f8221m.getClass();
                h(new C0458t(c0797f, c0799h));
                return this;
            } catch (InvalidProtocolBufferException e9) {
                C0458t c0458t2 = (C0458t) e9.f12155d;
                try {
                    throw e9;
                } catch (Throwable th) {
                    th = th;
                    c0458t = c0458t2;
                    if (c0458t != null) {
                        h(c0458t);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c0458t != null) {
            }
            throw th;
        }
    }

    @Override // g7.AbstractC0801j
    public final /* bridge */ /* synthetic */ AbstractC0801j e(g7.o oVar) {
        h((C0458t) oVar);
        return this;
    }

    public final C0458t f() {
        C0458t c0458t = new C0458t(this);
        int i4 = this.f8205e;
        int i8 = 1;
        if ((i4 & 1) != 1) {
            i8 = 0;
        }
        c0458t.f8224f = this.f8206f;
        if ((i4 & 2) == 2) {
            this.f8207g = Collections.unmodifiableList(this.f8207g);
            this.f8205e &= -3;
        }
        c0458t.f8225g = this.f8207g;
        if ((i4 & 4) == 4) {
            i8 |= 2;
        }
        c0458t.f8226h = this.f8208h;
        if ((i4 & 8) == 8) {
            i8 |= 4;
        }
        c0458t.f8227i = this.f8209i;
        c0458t.f8223e = i8;
        return c0458t;
    }

    public final void h(C0458t c0458t) {
        C0463y c0463y;
        if (c0458t == C0458t.f8220l) {
            return;
        }
        if ((c0458t.f8223e & 1) == 1) {
            r rVar = c0458t.f8224f;
            rVar.getClass();
            this.f8205e = 1 | this.f8205e;
            this.f8206f = rVar;
        }
        if (!c0458t.f8225g.isEmpty()) {
            if (this.f8207g.isEmpty()) {
                this.f8207g = c0458t.f8225g;
                this.f8205e &= -3;
            } else {
                if ((this.f8205e & 2) != 2) {
                    this.f8207g = new ArrayList(this.f8207g);
                    this.f8205e |= 2;
                }
                this.f8207g.addAll(c0458t.f8225g);
            }
        }
        if ((c0458t.f8223e & 2) == 2) {
            C0463y c0463y2 = c0458t.f8226h;
            if ((this.f8205e & 4) == 4 && (c0463y = this.f8208h) != C0463y.f8248o) {
                C0461w g8 = C0461w.g();
                g8.h(c0463y);
                g8.h(c0463y2);
                this.f8208h = g8.f();
            } else {
                this.f8208h = c0463y2;
            }
            this.f8205e |= 4;
        }
        if ((c0458t.f8223e & 4) == 4) {
            EnumC0457s enumC0457s = c0458t.f8227i;
            enumC0457s.getClass();
            this.f8205e |= 8;
            this.f8209i = enumC0457s;
        }
        this.f11240d = this.f11240d.h(c0458t.f8222d);
    }
}
