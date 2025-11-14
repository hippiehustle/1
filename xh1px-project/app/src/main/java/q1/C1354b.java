package q1;

import I7.v;
import L7.AbstractC0160s;
import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import R3.r;
import Z5.y;
import android.util.Log;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.io.File;
import n6.InterfaceC1164c;

/* renamed from: q1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1354b extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f13912h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f13913i;
    public final /* synthetic */ String j;
    public final /* synthetic */ int k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f13914l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1354b(e eVar, String str, int i4, int i8, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f13913i = eVar;
        this.j = str;
        this.k = i4;
        this.f13914l = i8;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1354b) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1354b(this.f13913i, this.j, this.k, this.f13914l, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f13912h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        r rVar = this.f13913i.f13924b;
        this.f13912h = 1;
        String str = this.j;
        Object obj2 = null;
        if (v.W(str, ".png")) {
            File file = new File((File) rVar.f5083f, str);
            if (!file.exists()) {
                Log.e("ConditionBitmapsDataSource", "Invalid path " + str + ", bitmap file can't be found.");
            } else {
                obj2 = AbstractC0166y.A((AbstractC0160s) rVar.f5082e, new h(file, this.k, this.f13914l, rVar, null), this);
            }
        }
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (obj2 == enumC0646a) {
            return enumC0646a;
        }
        return obj2;
    }
}
