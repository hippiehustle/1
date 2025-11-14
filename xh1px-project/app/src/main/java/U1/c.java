package U1;

import Z5.y;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import n1.C1150b;
import n1.C1152d;
import n6.InterfaceC1163b;
import o6.u;
import v7.C1678a;

/* loaded from: classes.dex */
public class c implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6024d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6025e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f6026f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6027g;

    public c(f fVar, n1.f fVar2, n1.i iVar) {
        this.f6024d = 3;
        this.f6027g = fVar;
        this.f6026f = fVar2;
        this.f6025e = iVar;
    }

    public static /* synthetic */ void f(int i4) {
        String str;
        int i8;
        if (i4 != 3 && i4 != 4) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 3 && i4 != 4) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3 && i4 != 4) {
                    objArr[0] = "storageManager";
                } else {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
                }
            } else {
                objArr[0] = "compute";
            }
        } else {
            objArr[0] = "map";
        }
        if (i4 != 3) {
            if (i4 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
        } else {
            objArr[1] = "recursionDetected";
        }
        if (i4 != 3 && i4 != 4) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i4 == 3 || i4 == 4) {
            throw new IllegalStateException(format);
        }
    }

    public AssertionError g(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Inconsistent key detected. " + v7.j.f15556e + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + ((v7.k) this.f6027g));
        v7.k.e(assertionError);
        return assertionError;
    }

    public AssertionError h(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + ((v7.k) this.f6027g));
        v7.k.e(assertionError);
        return assertionError;
    }

    public AssertionError k(Object obj, Throwable th) {
        AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + ((v7.k) this.f6027g), th);
        v7.k.e(assertionError);
        return assertionError;
    }

    @Override // n6.InterfaceC1163b
    public Object m(Object obj) {
        Long valueOf;
        Integer num;
        Long valueOf2;
        Boolean bool;
        Integer num2;
        AssertionError k;
        switch (this.f6024d) {
            case 0:
                n1.j jVar = (n1.j) obj;
                o6.j.e(jVar, "row");
                C1.b bVar = (C1.b) this.f6027g;
                n1.i iVar = (n1.i) this.f6025e;
                if (iVar instanceof C1150b) {
                    valueOf = (Long) Boolean.valueOf(jVar.a(((C1150b) iVar).f12838a));
                } else if (iVar instanceof n1.h) {
                    valueOf = (Long) jVar.d(((n1.h) iVar).f12853a);
                } else if (iVar instanceof n1.e) {
                    valueOf = (Long) Integer.valueOf(jVar.b(((n1.e) iVar).f12845a));
                } else {
                    if (!(iVar instanceof n1.g) && !(iVar instanceof C1152d) && !(iVar instanceof n1.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    valueOf = Long.valueOf(jVar.c(iVar.a()));
                }
                n1.i iVar2 = (n1.i) this.f6026f;
                if (iVar2 instanceof C1150b) {
                    num = (Integer) Boolean.valueOf(jVar.a(((C1150b) iVar2).f12838a));
                } else if (iVar2 instanceof n1.h) {
                    num = (Integer) jVar.d(((n1.h) iVar2).f12853a);
                } else if (iVar2 instanceof n1.e) {
                    num = Integer.valueOf(jVar.b(((n1.e) iVar2).f12845a));
                } else {
                    if (!(iVar2 instanceof n1.g) && !(iVar2 instanceof C1152d) && !(iVar2 instanceof n1.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    num = (Integer) Long.valueOf(jVar.c(iVar2.a()));
                }
                bVar.l(valueOf, num);
                return y.f7506a;
            case 1:
                n1.j jVar2 = (n1.j) obj;
                o6.j.e(jVar2, "row");
                n1.i iVar3 = (n1.i) this.f6025e;
                if (iVar3 instanceof C1150b) {
                    valueOf2 = (Long) Boolean.valueOf(jVar2.a(((C1150b) iVar3).f12838a));
                } else if (iVar3 instanceof n1.h) {
                    valueOf2 = (Long) jVar2.d(((n1.h) iVar3).f12853a);
                } else if (iVar3 instanceof n1.e) {
                    valueOf2 = (Long) Integer.valueOf(jVar2.b(((n1.e) iVar3).f12845a));
                } else {
                    if (!(iVar3 instanceof n1.g) && !(iVar3 instanceof C1152d) && !(iVar3 instanceof n1.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    valueOf2 = Long.valueOf(jVar2.c(iVar3.a()));
                }
                n1.i iVar4 = (n1.i) this.f6026f;
                if (iVar4 instanceof C1150b) {
                    bool = Boolean.valueOf(jVar2.a(((C1150b) iVar4).f12838a));
                } else if (iVar4 instanceof n1.h) {
                    bool = (Boolean) jVar2.d(((n1.h) iVar4).f12853a);
                } else if (iVar4 instanceof n1.e) {
                    bool = (Boolean) Integer.valueOf(jVar2.b(((n1.e) iVar4).f12845a));
                } else {
                    if (!(iVar4 instanceof n1.g) && !(iVar4 instanceof C1152d) && !(iVar4 instanceof n1.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bool = (Boolean) Long.valueOf(jVar2.c(iVar4.a()));
                }
                boolean booleanValue = bool.booleanValue();
                long longValue = valueOf2.longValue();
                u uVar = (u) this.f6027g;
                if (uVar.f13642d == null && booleanValue) {
                    uVar.f13642d = Long.valueOf(longValue);
                }
                return y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                n1.j jVar3 = (n1.j) obj;
                o6.j.e(jVar3, "row");
                ((g) this.f6027g).l(Long.valueOf(jVar3.c(((n1.f) this.f6025e).f12848a)), Integer.valueOf(jVar3.b(((n1.e) this.f6026f).f12845a)));
                return y.f7506a;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                n1.j jVar4 = (n1.j) obj;
                o6.j.e(jVar4, "row");
                f fVar = (f) this.f6027g;
                Long valueOf3 = Long.valueOf(jVar4.c(((n1.f) this.f6026f).f12848a));
                n1.i iVar5 = (n1.i) this.f6025e;
                if (iVar5 instanceof C1150b) {
                    num2 = (Integer) Boolean.valueOf(jVar4.a(((C1150b) iVar5).f12838a));
                } else if (iVar5 instanceof n1.h) {
                    num2 = (Integer) jVar4.d(((n1.h) iVar5).f12853a);
                } else if (iVar5 instanceof n1.e) {
                    num2 = Integer.valueOf(jVar4.b(((n1.e) iVar5).f12845a));
                } else {
                    if (!(iVar5 instanceof n1.g) && !(iVar5 instanceof C1152d) && !(iVar5 instanceof n1.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    num2 = (Integer) Long.valueOf(jVar4.c(iVar5.a()));
                }
                fVar.l(valueOf3, num2);
                return y.f7506a;
            default:
                v7.k kVar = (v7.k) this.f6027g;
                C1678a c1678a = kVar.f15562b;
                v7.m mVar = kVar.f15561a;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f6025e;
                Object obj2 = concurrentHashMap.get(obj);
                Object obj3 = F7.l.f1634a;
                AssertionError assertionError = null;
                v7.j jVar5 = v7.j.f15556e;
                if (obj2 != null && obj2 != jVar5) {
                    F7.l.k(obj2);
                    if (obj2 == obj3) {
                        return null;
                    }
                    return obj2;
                }
                mVar.lock();
                try {
                    Object obj4 = concurrentHashMap.get(obj);
                    v7.j jVar6 = v7.j.f15557f;
                    if (obj4 == jVar5) {
                        N.f d2 = kVar.d(obj, "");
                        if (d2 != null) {
                            if (!d2.f3524e) {
                                obj4 = d2.f3525f;
                                return obj4;
                            }
                            obj4 = jVar6;
                        } else {
                            f(3);
                            throw null;
                        }
                    }
                    if (obj4 == jVar6) {
                        N.f d3 = kVar.d(obj, "");
                        if (d3 != null) {
                            if (!d3.f3524e) {
                                obj4 = d3.f3525f;
                                return obj4;
                            }
                        } else {
                            f(3);
                            throw null;
                        }
                    }
                    if (obj4 != null) {
                        F7.l.k(obj4);
                        if (obj4 == obj3) {
                            obj4 = null;
                        }
                    } else {
                        try {
                            concurrentHashMap.put(obj, jVar5);
                            obj4 = ((InterfaceC1163b) this.f6026f).m(obj);
                            if (obj4 != null) {
                                obj3 = obj4;
                            }
                            Object put = concurrentHashMap.put(obj, obj3);
                            if (put != jVar5) {
                                assertionError = h(obj, put);
                                throw assertionError;
                            }
                        } catch (Throwable th) {
                            if (F7.l.i(th)) {
                                try {
                                    Object remove = concurrentHashMap.remove(obj);
                                    if (remove != jVar5) {
                                        throw g(obj, remove);
                                    }
                                    throw th;
                                } finally {
                                }
                            }
                            if (th != assertionError) {
                                Object put2 = concurrentHashMap.put(obj, new F7.k(th));
                                if (put2 != jVar5) {
                                    throw h(obj, put2);
                                }
                                c1678a.getClass();
                                throw th;
                            }
                            try {
                                concurrentHashMap.remove(obj);
                                c1678a.getClass();
                                throw th;
                            } finally {
                            }
                        }
                    }
                    return obj4;
                } finally {
                    mVar.unlock();
                }
        }
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i4) {
        this.f6024d = i4;
        this.f6027g = obj;
        this.f6025e = obj2;
        this.f6026f = obj3;
    }

    public c(n1.i iVar, n1.i iVar2, u uVar) {
        this.f6024d = 1;
        this.f6025e = iVar;
        this.f6026f = iVar2;
        this.f6027g = uVar;
    }
}
