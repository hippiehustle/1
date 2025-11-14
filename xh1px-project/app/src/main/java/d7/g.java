package d7;

import g7.AbstractC0793b;
import g7.AbstractC0801j;
import g7.C0797f;
import g7.C0799h;
import g7.o;
import g7.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes.dex */
public final class g extends AbstractC0801j implements u {

    /* renamed from: e, reason: collision with root package name */
    public int f10484e;

    /* renamed from: f, reason: collision with root package name */
    public int f10485f;

    /* renamed from: g, reason: collision with root package name */
    public int f10486g;

    /* renamed from: h, reason: collision with root package name */
    public Object f10487h;

    /* renamed from: i, reason: collision with root package name */
    public h f10488i;
    public List j;
    public List k;

    /* JADX WARN: Type inference failed for: r0v0, types: [d7.g, g7.j] */
    public static g g() {
        ?? abstractC0801j = new AbstractC0801j();
        abstractC0801j.f10485f = 1;
        abstractC0801j.f10487h = "";
        abstractC0801j.f10488i = h.NONE;
        List list = Collections.EMPTY_LIST;
        abstractC0801j.j = list;
        abstractC0801j.k = list;
        return abstractC0801j;
    }

    @Override // g7.AbstractC0801j
    public final AbstractC0793b c() {
        i f8 = f();
        f8.b();
        return f8;
    }

    public final Object clone() {
        g g8 = g();
        g8.h(f());
        return g8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // g7.AbstractC0801j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0801j d(C0797f c0797f, C0799h c0799h) {
        i iVar = null;
        try {
            try {
                i.f10495q.getClass();
                h(new i(c0797f));
                return this;
            } catch (InvalidProtocolBufferException e9) {
                i iVar2 = (i) e9.f12155d;
                try {
                    throw e9;
                } catch (Throwable th) {
                    th = th;
                    iVar = iVar2;
                    if (iVar != null) {
                        h(iVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (iVar != null) {
            }
            throw th;
        }
    }

    @Override // g7.AbstractC0801j
    public final /* bridge */ /* synthetic */ AbstractC0801j e(o oVar) {
        h((i) oVar);
        return this;
    }

    public final i f() {
        i iVar = new i(this);
        int i4 = this.f10484e;
        int i8 = 1;
        if ((i4 & 1) != 1) {
            i8 = 0;
        }
        iVar.f10498f = this.f10485f;
        if ((i4 & 2) == 2) {
            i8 |= 2;
        }
        iVar.f10499g = this.f10486g;
        if ((i4 & 4) == 4) {
            i8 |= 4;
        }
        iVar.f10500h = this.f10487h;
        if ((i4 & 8) == 8) {
            i8 |= 8;
        }
        iVar.f10501i = this.f10488i;
        if ((i4 & 16) == 16) {
            this.j = Collections.unmodifiableList(this.j);
            this.f10484e &= -17;
        }
        iVar.j = this.j;
        if ((this.f10484e & 32) == 32) {
            this.k = Collections.unmodifiableList(this.k);
            this.f10484e &= -33;
        }
        iVar.f10502l = this.k;
        iVar.f10497e = i8;
        return iVar;
    }

    public final void h(i iVar) {
        if (iVar == i.f10494p) {
            return;
        }
        int i4 = iVar.f10497e;
        if ((i4 & 1) == 1) {
            int i8 = iVar.f10498f;
            this.f10484e = 1 | this.f10484e;
            this.f10485f = i8;
        }
        if ((i4 & 2) == 2) {
            int i9 = iVar.f10499g;
            this.f10484e = 2 | this.f10484e;
            this.f10486g = i9;
        }
        if ((i4 & 4) == 4) {
            this.f10484e |= 4;
            this.f10487h = iVar.f10500h;
        }
        if ((i4 & 8) == 8) {
            h hVar = iVar.f10501i;
            hVar.getClass();
            this.f10484e = 8 | this.f10484e;
            this.f10488i = hVar;
        }
        if (!iVar.j.isEmpty()) {
            if (this.j.isEmpty()) {
                this.j = iVar.j;
                this.f10484e &= -17;
            } else {
                if ((this.f10484e & 16) != 16) {
                    this.j = new ArrayList(this.j);
                    this.f10484e |= 16;
                }
                this.j.addAll(iVar.j);
            }
        }
        if (!iVar.f10502l.isEmpty()) {
            if (this.k.isEmpty()) {
                this.k = iVar.f10502l;
                this.f10484e &= -33;
            } else {
                if ((this.f10484e & 32) != 32) {
                    this.k = new ArrayList(this.k);
                    this.f10484e |= 32;
                }
                this.k.addAll(iVar.f10502l);
            }
        }
        this.f11240d = this.f11240d.h(iVar.f10496d);
    }
}
