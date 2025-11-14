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

/* renamed from: a7.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0452m extends AbstractC0802k {

    /* renamed from: g, reason: collision with root package name */
    public int f8183g;

    /* renamed from: h, reason: collision with root package name */
    public int f8184h;

    /* renamed from: i, reason: collision with root package name */
    public List f8185i;
    public List j;
    public List k;

    /* renamed from: l, reason: collision with root package name */
    public List f8186l;

    /* JADX WARN: Type inference failed for: r0v0, types: [g7.k, a7.m] */
    public static C0452m h() {
        ?? abstractC0802k = new AbstractC0802k();
        abstractC0802k.f8184h = 6;
        List list = Collections.EMPTY_LIST;
        abstractC0802k.f8185i = list;
        abstractC0802k.j = list;
        abstractC0802k.k = list;
        abstractC0802k.f8186l = list;
        return abstractC0802k;
    }

    @Override // g7.AbstractC0801j
    public final AbstractC0793b c() {
        C0453n g8 = g();
        if (g8.b()) {
            return g8;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        C0452m h8 = h();
        h8.i(g());
        return h8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // g7.AbstractC0801j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0801j d(C0797f c0797f, C0799h c0799h) {
        C0453n c0453n = null;
        try {
            try {
                C0453n.f8188o.getClass();
                i(new C0453n(c0797f, c0799h));
                return this;
            } catch (InvalidProtocolBufferException e9) {
                C0453n c0453n2 = (C0453n) e9.f12155d;
                try {
                    throw e9;
                } catch (Throwable th) {
                    th = th;
                    c0453n = c0453n2;
                    if (c0453n != null) {
                        i(c0453n);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c0453n != null) {
            }
            throw th;
        }
    }

    @Override // g7.AbstractC0801j
    public final /* bridge */ /* synthetic */ AbstractC0801j e(g7.o oVar) {
        i((C0453n) oVar);
        return this;
    }

    public final C0453n g() {
        C0453n c0453n = new C0453n(this);
        int i4 = this.f8183g;
        int i8 = 1;
        if ((i4 & 1) != 1) {
            i8 = 0;
        }
        c0453n.f8191g = this.f8184h;
        if ((i4 & 2) == 2) {
            this.f8185i = Collections.unmodifiableList(this.f8185i);
            this.f8183g &= -3;
        }
        c0453n.f8192h = this.f8185i;
        if ((this.f8183g & 4) == 4) {
            this.j = Collections.unmodifiableList(this.j);
            this.f8183g &= -5;
        }
        c0453n.f8193i = this.j;
        if ((this.f8183g & 8) == 8) {
            this.k = Collections.unmodifiableList(this.k);
            this.f8183g &= -9;
        }
        c0453n.j = this.k;
        if ((this.f8183g & 16) == 16) {
            this.f8186l = Collections.unmodifiableList(this.f8186l);
            this.f8183g &= -17;
        }
        c0453n.k = this.f8186l;
        c0453n.f8190f = i8;
        return c0453n;
    }

    public final void i(C0453n c0453n) {
        if (c0453n == C0453n.f8187n) {
            return;
        }
        if ((c0453n.f8190f & 1) == 1) {
            int i4 = c0453n.f8191g;
            this.f8183g = 1 | this.f8183g;
            this.f8184h = i4;
        }
        if (!c0453n.f8192h.isEmpty()) {
            if (this.f8185i.isEmpty()) {
                this.f8185i = c0453n.f8192h;
                this.f8183g &= -3;
            } else {
                if ((this.f8183g & 2) != 2) {
                    this.f8185i = new ArrayList(this.f8185i);
                    this.f8183g |= 2;
                }
                this.f8185i.addAll(c0453n.f8192h);
            }
        }
        if (!c0453n.f8193i.isEmpty()) {
            if (this.j.isEmpty()) {
                this.j = c0453n.f8193i;
                this.f8183g &= -5;
            } else {
                if ((this.f8183g & 4) != 4) {
                    this.j = new ArrayList(this.j);
                    this.f8183g |= 4;
                }
                this.j.addAll(c0453n.f8193i);
            }
        }
        if (!c0453n.j.isEmpty()) {
            if (this.k.isEmpty()) {
                this.k = c0453n.j;
                this.f8183g &= -9;
            } else {
                if ((this.f8183g & 8) != 8) {
                    this.k = new ArrayList(this.k);
                    this.f8183g |= 8;
                }
                this.k.addAll(c0453n.j);
            }
        }
        if (!c0453n.k.isEmpty()) {
            if (this.f8186l.isEmpty()) {
                this.f8186l = c0453n.k;
                this.f8183g &= -17;
            } else {
                if ((this.f8183g & 16) != 16) {
                    this.f8186l = new ArrayList(this.f8186l);
                    this.f8183g |= 16;
                }
                this.f8186l.addAll(c0453n.k);
            }
        }
        f(c0453n);
        this.f11240d = this.f11240d.h(c0453n.f8189e);
    }
}
