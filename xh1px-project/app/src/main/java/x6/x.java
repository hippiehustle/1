package x6;

import L6.Q;
import a6.AbstractC0434i;
import a6.AbstractC0437l;
import h6.AbstractC0837b;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public abstract class x implements InterfaceC1803g {

    /* renamed from: a, reason: collision with root package name */
    public final Member f16273a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f16274b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f16275c;

    /* renamed from: d, reason: collision with root package name */
    public final List f16276d;

    public x(Member member, Type type, Class cls, Type[] typeArr) {
        List i12;
        this.f16273a = member;
        this.f16274b = type;
        this.f16275c = cls;
        if (cls != null) {
            Q q6 = new Q(2);
            q6.a(cls);
            q6.b(typeArr);
            ArrayList arrayList = q6.f3079a;
            i12 = AbstractC0437l.X(arrayList.toArray(new Type[arrayList.size()]));
        } else {
            i12 = AbstractC0434i.i1(typeArr);
        }
        this.f16276d = i12;
    }

    @Override // x6.InterfaceC1803g
    public final List a() {
        return this.f16276d;
    }

    @Override // x6.InterfaceC1803g
    public final Member b() {
        return this.f16273a;
    }

    @Override // x6.InterfaceC1803g
    public final boolean c() {
        return false;
    }

    public void e(Object[] objArr) {
        o6.j.e(objArr, "args");
        if (AbstractC0837b.i(this) == objArr.length) {
            return;
        }
        StringBuilder sb = new StringBuilder("Callable expects ");
        sb.append(AbstractC0837b.i(this));
        sb.append(" arguments, but ");
        throw new IllegalArgumentException(AbstractC1149a.h(sb, objArr.length, " were provided."));
    }

    public final void f(Object obj) {
        if (obj != null && this.f16273a.getDeclaringClass().isInstance(obj)) {
        } else {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // x6.InterfaceC1803g
    public final Type r() {
        return this.f16274b;
    }
}
