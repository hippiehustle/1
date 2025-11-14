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

/* renamed from: a7.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0459u extends AbstractC0802k {

    /* renamed from: g, reason: collision with root package name */
    public int f8228g;

    /* renamed from: h, reason: collision with root package name */
    public int f8229h;

    /* renamed from: i, reason: collision with root package name */
    public List f8230i;

    @Override // g7.AbstractC0801j
    public final AbstractC0793b c() {
        C0460v g8 = g();
        if (g8.b()) {
            return g8;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [a7.u, g7.k, java.lang.Object] */
    public final Object clone() {
        ?? abstractC0802k = new AbstractC0802k();
        abstractC0802k.f8230i = Collections.EMPTY_LIST;
        abstractC0802k.h(g());
        return abstractC0802k;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // g7.AbstractC0801j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0801j d(C0797f c0797f, C0799h c0799h) {
        C0460v c0460v = null;
        try {
            try {
                C0460v.f8231l.getClass();
                h(new C0460v(c0797f, c0799h));
                return this;
            } catch (InvalidProtocolBufferException e9) {
                C0460v c0460v2 = (C0460v) e9.f12155d;
                try {
                    throw e9;
                } catch (Throwable th) {
                    th = th;
                    c0460v = c0460v2;
                    if (c0460v != null) {
                        h(c0460v);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c0460v != null) {
            }
            throw th;
        }
    }

    @Override // g7.AbstractC0801j
    public final /* bridge */ /* synthetic */ AbstractC0801j e(g7.o oVar) {
        h((C0460v) oVar);
        return this;
    }

    public final C0460v g() {
        C0460v c0460v = new C0460v(this);
        int i4 = this.f8228g;
        int i8 = 1;
        if ((i4 & 1) != 1) {
            i8 = 0;
        }
        c0460v.f8234g = this.f8229h;
        if ((i4 & 2) == 2) {
            this.f8230i = Collections.unmodifiableList(this.f8230i);
            this.f8228g &= -3;
        }
        c0460v.f8235h = this.f8230i;
        c0460v.f8233f = i8;
        return c0460v;
    }

    public final void h(C0460v c0460v) {
        if (c0460v == C0460v.k) {
            return;
        }
        if ((c0460v.f8233f & 1) == 1) {
            int i4 = c0460v.f8234g;
            this.f8228g = 1 | this.f8228g;
            this.f8229h = i4;
        }
        if (!c0460v.f8235h.isEmpty()) {
            if (this.f8230i.isEmpty()) {
                this.f8230i = c0460v.f8235h;
                this.f8228g &= -3;
            } else {
                if ((this.f8228g & 2) != 2) {
                    this.f8230i = new ArrayList(this.f8230i);
                    this.f8228g |= 2;
                }
                this.f8230i.addAll(c0460v.f8235h);
            }
        }
        f(c0460v);
        this.f11240d = this.f11240d.h(c0460v.f8232e);
    }
}
