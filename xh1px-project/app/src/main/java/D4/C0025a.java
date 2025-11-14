package D4;

import O7.InterfaceC0234g;
import android.content.Context;
import com.buzbuz.smartautoclicker.R;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import kotlin.NoWhenBranchMatchedException;
import n6.InterfaceC1165d;

/* renamed from: D4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0025a extends AbstractC0720j implements InterfaceC1165d {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f937h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f938i;
    public /* synthetic */ Object j;
    public /* synthetic */ Object k;

    public /* synthetic */ C0025a(int i4, InterfaceC0617c interfaceC0617c) {
        super(i4, interfaceC0617c);
    }

    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        switch (this.f937h) {
            case 0:
                C0025a c0025a = new C0025a(3, (InterfaceC0617c) obj3);
                c0025a.j = (InterfaceC0234g) obj;
                c0025a.k = (C4.b) obj2;
                return c0025a.v(Z5.y.f7506a);
            default:
                int intValue = ((Number) obj2).intValue();
                C0025a c0025a2 = new C0025a((Context) this.k, (InterfaceC0617c) obj3);
                c0025a2.j = (b5.i) obj;
                c0025a2.f938i = intValue;
                return c0025a2.v(Z5.y.f7506a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0125, code lost:
    
        if (L7.AbstractC0166y.g(1500, r12) == r9) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0116, code lost:
    
        if (r0.n(r13, r12) == r9) goto L44;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        b5.f fVar;
        switch (this.f937h) {
            case 0:
                InterfaceC0234g interfaceC0234g = (InterfaceC0234g) this.j;
                C4.b bVar = (C4.b) this.k;
                int i4 = this.f938i;
                Z5.y yVar = Z5.y.f7506a;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                Z5.a.d(obj);
                                C0033i c0033i = new C0033i();
                                this.j = null;
                                this.k = null;
                                this.f938i = 4;
                                if (interfaceC0234g.n(c0033i, this) != enumC0646a) {
                                    return yVar;
                                }
                                return enumC0646a;
                            }
                        } else {
                            Z5.a.d(obj);
                        }
                    }
                    Z5.a.d(obj);
                    return yVar;
                }
                Z5.a.d(obj);
                if (bVar == null) {
                    C0033i c0033i2 = new C0033i();
                    this.j = null;
                    this.k = null;
                    this.f938i = 1;
                    if (interfaceC0234g.n(c0033i2, this) != enumC0646a) {
                        return yVar;
                    }
                } else {
                    C0033i c0033i3 = new C0033i(bVar.f613a.f11961c, bVar.f614b.f11791c, E2.d.n(bVar.f617e));
                    this.j = interfaceC0234g;
                    this.k = null;
                    this.f938i = 2;
                    break;
                }
                return enumC0646a;
                this.j = interfaceC0234g;
                this.k = null;
                this.f938i = 3;
                break;
            default:
                b5.i iVar = (b5.i) this.j;
                int i8 = this.f938i;
                Z5.a.d(obj);
                Context context = (Context) this.k;
                int ordinal = iVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                String string = context.getString(R.string.message_condition_migration_error);
                                o6.j.d(string, "getString(...)");
                                String string2 = context.getString(R.string.button_condition_migration_finished);
                                o6.j.d(string2, "getString(...)");
                                return new b5.f(iVar, string, new B2.c(string2));
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        String string3 = context.getString(R.string.message_condition_migration_success);
                        o6.j.d(string3, "getString(...)");
                        String string4 = context.getString(R.string.button_condition_migration_finished);
                        o6.j.d(string4, "getString(...)");
                        return new b5.f(iVar, string3, new B2.c(string4));
                    }
                    String string5 = context.getString(R.string.message_condition_migration_count, Integer.valueOf(i8));
                    o6.j.d(string5, "getString(...)");
                    String string6 = context.getString(R.string.button_condition_migration_running);
                    o6.j.d(string6, "getString(...)");
                    fVar = new b5.f(iVar, string5, new B2.d(string6));
                } else {
                    String string7 = context.getString(R.string.message_condition_migration_count, Integer.valueOf(i8));
                    o6.j.d(string7, "getString(...)");
                    String string8 = context.getString(R.string.button_condition_migration_start);
                    o6.j.d(string8, "getString(...)");
                    fVar = new b5.f(iVar, string7, new B2.c(string8));
                }
                return fVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0025a(Context context, InterfaceC0617c interfaceC0617c) {
        super(3, interfaceC0617c);
        this.k = context;
    }
}
