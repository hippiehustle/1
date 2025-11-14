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
public final class f extends AbstractC0801j implements u {

    /* renamed from: e, reason: collision with root package name */
    public int f10481e;

    /* renamed from: f, reason: collision with root package name */
    public List f10482f;

    /* renamed from: g, reason: collision with root package name */
    public List f10483g;

    @Override // g7.AbstractC0801j
    public final AbstractC0793b c() {
        j f8 = f();
        f8.b();
        return f8;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g7.j, d7.f, java.lang.Object] */
    public final Object clone() {
        ?? abstractC0801j = new AbstractC0801j();
        List list = Collections.EMPTY_LIST;
        abstractC0801j.f10482f = list;
        abstractC0801j.f10483g = list;
        abstractC0801j.g(f());
        return abstractC0801j;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // g7.AbstractC0801j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0801j d(C0797f c0797f, C0799h c0799h) {
        j jVar = null;
        try {
            try {
                j.k.getClass();
                g(new j(c0797f, c0799h));
                return this;
            } catch (InvalidProtocolBufferException e9) {
                j jVar2 = (j) e9.f12155d;
                try {
                    throw e9;
                } catch (Throwable th) {
                    th = th;
                    jVar = jVar2;
                    if (jVar != null) {
                        g(jVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (jVar != null) {
            }
            throw th;
        }
    }

    @Override // g7.AbstractC0801j
    public final /* bridge */ /* synthetic */ AbstractC0801j e(o oVar) {
        g((j) oVar);
        return this;
    }

    public final j f() {
        j jVar = new j(this);
        if ((this.f10481e & 1) == 1) {
            this.f10482f = Collections.unmodifiableList(this.f10482f);
            this.f10481e &= -2;
        }
        jVar.f10507e = this.f10482f;
        if ((this.f10481e & 2) == 2) {
            this.f10483g = Collections.unmodifiableList(this.f10483g);
            this.f10481e &= -3;
        }
        jVar.f10508f = this.f10483g;
        return jVar;
    }

    public final void g(j jVar) {
        if (jVar == j.j) {
            return;
        }
        if (!jVar.f10507e.isEmpty()) {
            if (this.f10482f.isEmpty()) {
                this.f10482f = jVar.f10507e;
                this.f10481e &= -2;
            } else {
                if ((this.f10481e & 1) != 1) {
                    this.f10482f = new ArrayList(this.f10482f);
                    this.f10481e |= 1;
                }
                this.f10482f.addAll(jVar.f10507e);
            }
        }
        if (!jVar.f10508f.isEmpty()) {
            if (this.f10483g.isEmpty()) {
                this.f10483g = jVar.f10508f;
                this.f10481e &= -3;
            } else {
                if ((this.f10481e & 2) != 2) {
                    this.f10483g = new ArrayList(this.f10483g);
                    this.f10481e |= 2;
                }
                this.f10483g.addAll(jVar.f10508f);
            }
        }
        this.f11240d = this.f11240d.h(jVar.f10506d);
    }
}
