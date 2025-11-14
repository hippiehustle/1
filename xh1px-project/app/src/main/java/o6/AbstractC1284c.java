package o6;

import java.io.Serializable;
import u6.InterfaceC1641b;
import u6.InterfaceC1644e;

/* renamed from: o6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1284c implements InterfaceC1641b, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public transient InterfaceC1641b f13628d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f13629e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f13630f;

    /* renamed from: g, reason: collision with root package name */
    public final String f13631g;

    /* renamed from: h, reason: collision with root package name */
    public final String f13632h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f13633i;

    public AbstractC1284c(Object obj, Class cls, String str, String str2, boolean z8) {
        this.f13629e = obj;
        this.f13630f = cls;
        this.f13631g = str;
        this.f13632h = str2;
        this.f13633i = z8;
    }

    public abstract InterfaceC1641b f();

    public final InterfaceC1644e g() {
        Class cls = this.f13630f;
        if (cls == null) {
            return null;
        }
        if (this.f13633i) {
            return v.f13643a.c(cls);
        }
        return v.f13643a.b(cls);
    }

    @Override // u6.InterfaceC1641b
    public final String getName() {
        return this.f13631g;
    }
}
