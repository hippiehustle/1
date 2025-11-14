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
public final class W extends AbstractC0802k {

    /* renamed from: g, reason: collision with root package name */
    public int f7973g;

    /* renamed from: h, reason: collision with root package name */
    public int f7974h;

    /* renamed from: i, reason: collision with root package name */
    public int f7975i;
    public boolean j;
    public X k;

    /* renamed from: l, reason: collision with root package name */
    public List f7976l;

    /* renamed from: m, reason: collision with root package name */
    public List f7977m;

    /* JADX WARN: Type inference failed for: r0v0, types: [g7.k, a7.W] */
    public static W h() {
        ?? abstractC0802k = new AbstractC0802k();
        abstractC0802k.k = X.INV;
        List list = Collections.EMPTY_LIST;
        abstractC0802k.f7976l = list;
        abstractC0802k.f7977m = list;
        return abstractC0802k;
    }

    @Override // g7.AbstractC0801j
    public final AbstractC0793b c() {
        Y g8 = g();
        if (g8.b()) {
            return g8;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        W h8 = h();
        h8.i(g());
        return h8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // g7.AbstractC0801j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0801j d(C0797f c0797f, C0799h c0799h) {
        Y y4 = null;
        try {
            try {
                Y.f7984q.getClass();
                i(new Y(c0797f, c0799h));
                return this;
            } catch (InvalidProtocolBufferException e9) {
                Y y5 = (Y) e9.f12155d;
                try {
                    throw e9;
                } catch (Throwable th) {
                    th = th;
                    y4 = y5;
                    if (y4 != null) {
                        i(y4);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (y4 != null) {
            }
            throw th;
        }
    }

    @Override // g7.AbstractC0801j
    public final /* bridge */ /* synthetic */ AbstractC0801j e(g7.o oVar) {
        i((Y) oVar);
        return this;
    }

    public final Y g() {
        Y y4 = new Y(this);
        int i4 = this.f7973g;
        int i8 = 1;
        if ((i4 & 1) != 1) {
            i8 = 0;
        }
        y4.f7987g = this.f7974h;
        if ((i4 & 2) == 2) {
            i8 |= 2;
        }
        y4.f7988h = this.f7975i;
        if ((i4 & 4) == 4) {
            i8 |= 4;
        }
        y4.f7989i = this.j;
        if ((i4 & 8) == 8) {
            i8 |= 8;
        }
        y4.j = this.k;
        if ((i4 & 16) == 16) {
            this.f7976l = Collections.unmodifiableList(this.f7976l);
            this.f7973g &= -17;
        }
        y4.k = this.f7976l;
        if ((this.f7973g & 32) == 32) {
            this.f7977m = Collections.unmodifiableList(this.f7977m);
            this.f7973g &= -33;
        }
        y4.f7990l = this.f7977m;
        y4.f7986f = i8;
        return y4;
    }

    public final void i(Y y4) {
        if (y4 == Y.f7983p) {
            return;
        }
        int i4 = y4.f7986f;
        if ((i4 & 1) == 1) {
            int i8 = y4.f7987g;
            this.f7973g = 1 | this.f7973g;
            this.f7974h = i8;
        }
        if ((i4 & 2) == 2) {
            int i9 = y4.f7988h;
            this.f7973g = 2 | this.f7973g;
            this.f7975i = i9;
        }
        if ((i4 & 4) == 4) {
            boolean z8 = y4.f7989i;
            this.f7973g = 4 | this.f7973g;
            this.j = z8;
        }
        if ((i4 & 8) == 8) {
            X x8 = y4.j;
            x8.getClass();
            this.f7973g = 8 | this.f7973g;
            this.k = x8;
        }
        if (!y4.k.isEmpty()) {
            if (this.f7976l.isEmpty()) {
                this.f7976l = y4.k;
                this.f7973g &= -17;
            } else {
                if ((this.f7973g & 16) != 16) {
                    this.f7976l = new ArrayList(this.f7976l);
                    this.f7973g |= 16;
                }
                this.f7976l.addAll(y4.k);
            }
        }
        if (!y4.f7990l.isEmpty()) {
            if (this.f7977m.isEmpty()) {
                this.f7977m = y4.f7990l;
                this.f7973g &= -33;
            } else {
                if ((this.f7973g & 32) != 32) {
                    this.f7977m = new ArrayList(this.f7977m);
                    this.f7973g |= 32;
                }
                this.f7977m.addAll(y4.f7990l);
            }
        }
        f(y4);
        this.f11240d = this.f11240d.h(y4.f7985e);
    }
}
