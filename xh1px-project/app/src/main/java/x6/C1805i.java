package x6;

import L6.Q;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: x6.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1805i extends x {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16261e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1805i(Member member, Type type, Class cls, Type[] typeArr, int i4) {
        super(member, type, cls, typeArr);
        this.f16261e = i4;
    }

    @Override // x6.InterfaceC1803g
    public final Object d(Object[] objArr) {
        switch (this.f16261e) {
            case 0:
                o6.j.e(objArr, "args");
                e(objArr);
                Constructor constructor = (Constructor) this.f16273a;
                Q q6 = new Q(2);
                q6.b(objArr);
                q6.a(null);
                ArrayList arrayList = q6.f3079a;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                o6.j.e(objArr, "args");
                e(objArr);
                return ((Constructor) this.f16273a).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }
}
