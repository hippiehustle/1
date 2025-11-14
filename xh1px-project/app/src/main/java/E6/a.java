package E6;

import C6.InterfaceC0004e;
import a6.s;
import f7.C0725e;
import java.util.Collection;
import o6.j;
import u7.r;

/* loaded from: classes.dex */
public final class a implements b, d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f1251b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f1252c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f1253d = new a(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1254a;

    public /* synthetic */ a(int i4) {
        this.f1254a = i4;
    }

    @Override // E6.b
    public Collection a(InterfaceC0004e interfaceC0004e) {
        j.e(interfaceC0004e, "classDescriptor");
        return s.f7766d;
    }

    @Override // E6.b
    public Collection b(InterfaceC0004e interfaceC0004e) {
        return s.f7766d;
    }

    @Override // E6.b
    public Collection c(C0725e c0725e, InterfaceC0004e interfaceC0004e) {
        j.e(c0725e, "name");
        j.e(interfaceC0004e, "classDescriptor");
        return s.f7766d;
    }

    @Override // E6.b
    public Collection d(InterfaceC0004e interfaceC0004e) {
        return s.f7766d;
    }

    @Override // E6.d
    public boolean e(InterfaceC0004e interfaceC0004e, r rVar) {
        switch (this.f1254a) {
            case 1:
                j.e(interfaceC0004e, "classDescriptor");
                return true;
            default:
                j.e(interfaceC0004e, "classDescriptor");
                return !rVar.getAnnotations().a(e.f1255a);
        }
    }
}
