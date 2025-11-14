package P7;

import L7.AbstractC0166y;
import L7.EnumC0164w;
import L7.InterfaceC0163v;
import L7.X;
import O7.InterfaceC0234g;
import a6.AbstractC0434i;
import a6.AbstractC0436k;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import java.util.ArrayList;
import java.util.Set;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import u0.C1598C;

/* loaded from: classes.dex */
public final class l implements InterfaceC0234g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4658d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o6.u f4659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0234g f4660f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4661g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4662h;

    public l(o6.u uVar, InterfaceC0163v interfaceC0163v, n nVar, InterfaceC0234g interfaceC0234g) {
        this.f4659e = uVar;
        this.f4661g = interfaceC0163v;
        this.f4662h = nVar;
        this.f4660f = interfaceC0234g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r5.n(r15, r1) == r6) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009c, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009a, code lost:
    
        if (r5.n(r15, r1) == r6) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(int[] iArr, InterfaceC0617c interfaceC0617c) {
        C1598C c1598c;
        int i4;
        l lVar;
        String[] strArr = (String[]) this.f4661g;
        if (interfaceC0617c instanceof C1598C) {
            c1598c = (C1598C) interfaceC0617c;
            int i8 = c1598c.k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c1598c.k = i8 - Integer.MIN_VALUE;
                Object obj = c1598c.f15153i;
                i4 = c1598c.k;
                if (i4 == 0) {
                    if (i4 != 1 && i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iArr = c1598c.f15152h;
                    lVar = c1598c.f15151g;
                    Z5.a.d(obj);
                } else {
                    Z5.a.d(obj);
                    o6.u uVar = this.f4659e;
                    Object obj2 = uVar.f13642d;
                    InterfaceC0234g interfaceC0234g = this.f4660f;
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (obj2 == null) {
                        Set l12 = AbstractC0434i.l1(strArr);
                        c1598c.f15151g = this;
                        c1598c.f15152h = iArr;
                        c1598c.k = 1;
                    } else {
                        int[] iArr2 = (int[]) this.f4662h;
                        ArrayList arrayList = new ArrayList();
                        int length = strArr.length;
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < length) {
                            String str = strArr[i9];
                            int i11 = i10 + 1;
                            Object obj3 = uVar.f13642d;
                            if (obj3 != null) {
                                int i12 = iArr2[i10];
                                if (((int[]) obj3)[i12] != iArr[i12]) {
                                    arrayList.add(str);
                                }
                                i9++;
                                i10 = i11;
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            Set V02 = AbstractC0436k.V0(arrayList);
                            c1598c.f15151g = this;
                            c1598c.f15152h = iArr;
                            c1598c.k = 2;
                        }
                        lVar = this;
                    }
                }
                lVar.f4659e.f13642d = iArr;
                return Z5.y.f7506a;
            }
        }
        c1598c = new C1598C(this, interfaceC0617c);
        Object obj4 = c1598c.f15153i;
        i4 = c1598c.k;
        if (i4 == 0) {
        }
        lVar.f4659e.f13642d = iArr;
        return Z5.y.f7506a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    @Override // O7.InterfaceC0234g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        k kVar;
        int i4;
        l lVar;
        switch (this.f4658d) {
            case 0:
                if (interfaceC0617c instanceof k) {
                    kVar = (k) interfaceC0617c;
                    int i8 = kVar.k;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        kVar.k = i8 - Integer.MIN_VALUE;
                        Object obj2 = kVar.f4657i;
                        i4 = kVar.k;
                        if (i4 == 0) {
                            if (i4 == 1) {
                                obj = kVar.f4656h;
                                lVar = kVar.f4655g;
                                Z5.a.d(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj2);
                            X x8 = (X) this.f4659e.f13642d;
                            if (x8 != null) {
                                x8.d(new ChildCancelledException());
                                kVar.f4655g = this;
                                kVar.f4656h = obj;
                                kVar.k = 1;
                                Object v8 = x8.v(kVar);
                                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                                if (v8 == enumC0646a) {
                                    return enumC0646a;
                                }
                            }
                            lVar = this;
                        }
                        lVar.f4659e.f13642d = AbstractC0166y.q((InterfaceC0163v) lVar.f4661g, null, EnumC0164w.f3251g, new j((n) lVar.f4662h, lVar.f4660f, obj, null), 1);
                        return Z5.y.f7506a;
                    }
                }
                kVar = new k(this, interfaceC0617c);
                Object obj22 = kVar.f4657i;
                i4 = kVar.k;
                if (i4 == 0) {
                }
                lVar.f4659e.f13642d = AbstractC0166y.q((InterfaceC0163v) lVar.f4661g, null, EnumC0164w.f3251g, new j((n) lVar.f4662h, lVar.f4660f, obj, null), 1);
                return Z5.y.f7506a;
            default:
                return a((int[]) obj, interfaceC0617c);
        }
    }

    public l(o6.u uVar, InterfaceC0234g interfaceC0234g, String[] strArr, int[] iArr) {
        this.f4659e = uVar;
        this.f4660f = interfaceC0234g;
        this.f4661g = strArr;
        this.f4662h = iArr;
    }
}
