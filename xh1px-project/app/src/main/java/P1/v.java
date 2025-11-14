package P1;

import L7.AbstractC0160s;
import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import O7.V;
import Z5.y;
import a6.AbstractC0437l;
import android.util.Log;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import i.AbstractActivityC0870i;
import java.util.Iterator;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class v extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f4486h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w f4487i;
    public final /* synthetic */ U4.a j;
    public final /* synthetic */ AbstractActivityC0870i k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, U4.a aVar, InterfaceC0617c interfaceC0617c, AbstractActivityC0870i abstractActivityC0870i) {
        super(2, interfaceC0617c);
        this.f4487i = wVar;
        this.j = aVar;
        this.k = abstractActivityC0870i;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((v) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new v(this.f4487i, this.j, interfaceC0617c, this.k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c8, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x003b, code lost:
    
        if (r15 == r7) goto L40;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        int i4 = this.f4486h;
        y yVar = y.f7506a;
        w wVar = this.f4487i;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4) {
                            Z5.a.d(obj);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Z5.a.d(obj);
                    return yVar;
                }
                Z5.a.d(obj);
                return yVar;
            }
            Z5.a.d(obj);
        } else {
            Z5.a.d(obj);
            A.i iVar = wVar.f4489a.f4473c;
            this.f4486h = 1;
            obj = V.n(iVar, this);
        }
        N1.d dVar = (N1.d) obj;
        Iterator it = w.f4488i.iterator();
        int i8 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            U4.a aVar = this.j;
            if (hasNext) {
                Object next = it.next();
                int i9 = i8 + 1;
                if (i8 >= 0) {
                    int intValue = ((Number) next).intValue();
                    int i10 = dVar.f3717c;
                    if (i10 < intValue) {
                        AbstractC0160s abstractC0160s = wVar.f4490b;
                        s sVar = new s(aVar, null);
                        this.f4486h = 2;
                        if (AbstractC0166y.A(abstractC0160s, sVar, this) == enumC0646a) {
                        }
                    } else {
                        int i11 = dVar.f3718d;
                        if (i11 <= i8) {
                            Log.i("QualityManager", "Starting troubleshooting dialog, lossCount=" + i10 + "; displayCount=" + i11);
                            wVar.f4492d = true;
                            o oVar = wVar.f4489a;
                            AbstractC0166y.q(oVar.f4472b, null, null, new n(oVar, null), 3);
                            AbstractC0160s abstractC0160s2 = wVar.f4490b;
                            t tVar = new t(wVar, aVar, null, this.k);
                            this.f4486h = 3;
                            if (AbstractC0166y.A(abstractC0160s2, tVar, this) == enumC0646a) {
                            }
                        } else {
                            i8 = i9;
                        }
                    }
                } else {
                    AbstractC0437l.c0();
                    throw null;
                }
            } else {
                AbstractC0160s abstractC0160s3 = wVar.f4490b;
                u uVar = new u(aVar, null);
                this.f4486h = 4;
                if (AbstractC0166y.A(abstractC0160s3, uVar, this) == enumC0646a) {
                }
            }
        }
        return enumC0646a;
    }
}
