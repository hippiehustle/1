package I6;

import java.lang.reflect.Member;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final /* synthetic */ class j extends o6.i implements InterfaceC1163b {

    /* renamed from: l, reason: collision with root package name */
    public static final j f2203l = new o6.i(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        Member member = (Member) obj;
        o6.j.e(member, "p0");
        return Boolean.valueOf(member.isSynthetic());
    }
}
