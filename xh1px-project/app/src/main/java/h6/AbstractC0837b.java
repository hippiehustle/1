package h6;

import D0.c;
import F7.f;
import T1.r;
import T1.t;
import a.AbstractC0405a;
import a6.AbstractC0434i;
import android.accessibilityservice.GestureDescription;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c0.o;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.textview.MaterialTextView;
import e2.AbstractC0640c;
import e2.C0638a;
import e2.C0639b;
import h7.u;
import j2.AbstractC0901a;
import j2.C0902b;
import j2.C0903c;
import j2.C0905e;
import j2.EnumC0904d;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import k3.C0965l;
import kotlin.NoWhenBranchMatchedException;
import l1.C0999a;
import n1.AbstractC1149a;
import n6.InterfaceC1163b;
import o6.j;
import p7.C1319a;
import p7.C1332n;
import p7.InterfaceC1333o;
import r6.AbstractC1473d;
import r6.C1474e;
import u6.InterfaceC1641b;
import u6.InterfaceC1645f;
import u6.InterfaceC1646g;
import u6.n;
import u6.s;
import w6.AbstractC1731s;
import w6.y0;
import w7.X;
import x6.InterfaceC1803g;
import z7.EnumC1892i;

/* renamed from: h6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0837b {
    public static GestureDescription c(GestureDescription.Builder builder, Path path, long j, C1474e c1474e) {
        long j5;
        if (c1474e != null) {
            j5 = c1474e.f(j - 5, 6 + j);
        } else {
            j5 = j;
        }
        try {
            builder.addStroke(new GestureDescription.StrokeDescription(path, Math.max(0L, 0L), Math.max(1L, Math.min(59999L, j5))));
            GestureDescription build = builder.build();
            j.d(build, "build(...)");
            return build;
        } catch (IllegalArgumentException e9) {
            throw new IllegalArgumentException(AbstractC1149a.f("Invalid gesture; Duration=", j), e9);
        } catch (IllegalStateException e10) {
            throw new IllegalStateException(AbstractC1149a.f("Invalid gesture; Duration=", j), e10);
        }
    }

    public static final void d(AutoCloseable autoCloseable, Throwable th) {
        boolean isTerminated;
        if (autoCloseable != null) {
            if (th == null) {
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                    return;
                }
                if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z8 = false;
                        while (!isTerminated) {
                            try {
                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z8) {
                                    executorService.shutdownNow();
                                    z8 = true;
                                }
                            }
                        }
                        if (z8) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else {
                    if (autoCloseable instanceof MediaDrm) {
                        ((MediaDrm) autoCloseable).release();
                        return;
                    }
                    throw new IllegalArgumentException();
                }
            }
            try {
                A.j.v(autoCloseable);
            } catch (Throwable th2) {
                Z5.a.a(th, th2);
            }
        }
    }

    public static final EnumC1892i e(X x8) {
        int ordinal = x8.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return EnumC1892i.f16826f;
                }
                throw new NoWhenBranchMatchedException();
            }
            return EnumC1892i.f16825e;
        }
        return EnumC1892i.f16827g;
    }

    public static InterfaceC1333o f(String str, List list) {
        C1332n c1332n;
        j.e(str, "debugName");
        f fVar = new f();
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c1332n = C1332n.f13842b;
            if (!hasNext) {
                break;
            }
            InterfaceC1333o interfaceC1333o = (InterfaceC1333o) it.next();
            if (interfaceC1333o != c1332n) {
                if (interfaceC1333o instanceof C1319a) {
                    InterfaceC1333o[] interfaceC1333oArr = ((C1319a) interfaceC1333o).f13803c;
                    j.e(interfaceC1333oArr, "elements");
                    fVar.addAll(AbstractC0434i.K0(interfaceC1333oArr));
                } else {
                    fVar.add(interfaceC1333o);
                }
            }
        }
        int i4 = fVar.f1624d;
        if (i4 != 0) {
            if (i4 != 1) {
                return new C1319a(str, (InterfaceC1333o[]) fVar.toArray(new InterfaceC1333o[0]));
            }
            return (InterfaceC1333o) fVar.get(0);
        }
        return c1332n;
    }

    public static final void h(View view, E1.a aVar) {
        j.e(view, "<this>");
        if (view.getWidth() != 0 && view.getHeight() != 0) {
            aVar.a();
        } else if (view.isLaidOut() && !view.isLayoutRequested()) {
            h(view, aVar);
        } else {
            view.addOnLayoutChangeListener(new G2.b(view, 1, aVar));
        }
    }

    public static final int i(InterfaceC1803g interfaceC1803g) {
        j.e(interfaceC1803g, "<this>");
        return interfaceC1803g.a().size();
    }

    public static String j(o oVar, int i4) {
        j.e(oVar, "context");
        if (i4 <= 16777215) {
            return String.valueOf(i4);
        }
        try {
            String resourceName = oVar.f9402a.getResources().getResourceName(i4);
            j.b(resourceName);
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i4);
        }
    }

    public static final int k(int i4, int i8, int i9) {
        if (i9 > 0) {
            if (i4 < i8) {
                int i10 = i8 % i9;
                if (i10 < 0) {
                    i10 += i9;
                }
                int i11 = i4 % i9;
                if (i11 < 0) {
                    i11 += i9;
                }
                int i12 = (i10 - i11) % i9;
                if (i12 < 0) {
                    i12 += i9;
                }
                return i8 - i12;
            }
        } else if (i9 < 0) {
            if (i4 > i8) {
                int i13 = -i9;
                int i14 = i4 % i13;
                if (i14 < 0) {
                    i14 += i13;
                }
                int i15 = i8 % i13;
                if (i15 < 0) {
                    i15 += i13;
                }
                int i16 = (i14 - i15) % i13;
                if (i16 < 0) {
                    i16 += i13;
                }
                return i16 + i8;
            }
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
        return i8;
    }

    public static final boolean n(InterfaceC1641b interfaceC1641b) {
        boolean z8;
        Object obj;
        AccessibleObject accessibleObject;
        boolean z9;
        Object obj2;
        boolean z10;
        InterfaceC1803g h8;
        InterfaceC1803g n3;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        if (interfaceC1641b instanceof u6.j) {
            s sVar = (s) interfaceC1641b;
            Field e9 = u.e(sVar);
            if (e9 != null) {
                z17 = e9.isAccessible();
            } else {
                z17 = true;
            }
            if (z17) {
                Method f8 = u.f(sVar.c());
                if (f8 != null) {
                    z18 = f8.isAccessible();
                } else {
                    z18 = true;
                }
                if (z18) {
                    Method f9 = u.f(((u6.j) interfaceC1641b).i());
                    if (f9 != null) {
                        z19 = f9.isAccessible();
                    } else {
                        z19 = true;
                    }
                    if (!z19) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else if (interfaceC1641b instanceof s) {
            s sVar2 = (s) interfaceC1641b;
            Field e10 = u.e(sVar2);
            if (e10 != null) {
                z15 = e10.isAccessible();
            } else {
                z15 = true;
            }
            if (z15) {
                Method f10 = u.f(sVar2.c());
                if (f10 != null) {
                    z16 = f10.isAccessible();
                } else {
                    z16 = true;
                }
                if (!z16) {
                    return false;
                }
            } else {
                return false;
            }
        } else if (interfaceC1641b instanceof n) {
            Field e11 = u.e(((n) interfaceC1641b).f());
            if (e11 != null) {
                z13 = e11.isAccessible();
            } else {
                z13 = true;
            }
            if (z13) {
                Method f11 = u.f((InterfaceC1645f) interfaceC1641b);
                if (f11 != null) {
                    z14 = f11.isAccessible();
                } else {
                    z14 = true;
                }
                if (!z14) {
                    return false;
                }
            } else {
                return false;
            }
        } else if (interfaceC1641b instanceof InterfaceC1646g) {
            Field e12 = u.e(((InterfaceC1646g) interfaceC1641b).f());
            if (e12 != null) {
                z11 = e12.isAccessible();
            } else {
                z11 = true;
            }
            if (z11) {
                Method f12 = u.f((InterfaceC1645f) interfaceC1641b);
                if (f12 != null) {
                    z12 = f12.isAccessible();
                } else {
                    z12 = true;
                }
                if (!z12) {
                    return false;
                }
            } else {
                return false;
            }
        } else if (interfaceC1641b instanceof InterfaceC1645f) {
            InterfaceC1645f interfaceC1645f = (InterfaceC1645f) interfaceC1641b;
            Method f13 = u.f(interfaceC1645f);
            if (f13 != null) {
                z8 = f13.isAccessible();
            } else {
                z8 = true;
            }
            if (z8) {
                AbstractC1731s a3 = y0.a(interfaceC1641b);
                Constructor constructor = null;
                if (a3 != null && (n3 = a3.n()) != null) {
                    obj = n3.b();
                } else {
                    obj = null;
                }
                if (obj instanceof AccessibleObject) {
                    accessibleObject = (AccessibleObject) obj;
                } else {
                    accessibleObject = null;
                }
                if (accessibleObject != null) {
                    z9 = accessibleObject.isAccessible();
                } else {
                    z9 = true;
                }
                if (z9) {
                    AbstractC1731s a4 = y0.a(interfaceC1645f);
                    if (a4 != null && (h8 = a4.h()) != null) {
                        obj2 = h8.b();
                    } else {
                        obj2 = null;
                    }
                    if (obj2 instanceof Constructor) {
                        constructor = (Constructor) obj2;
                    }
                    if (constructor != null) {
                        z10 = constructor.isAccessible();
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            throw new UnsupportedOperationException("Unknown callable: " + interfaceC1641b + " (" + interfaceC1641b.getClass() + ')');
        }
        return true;
    }

    public static final void o(Path path, Point point, Point point2, C1474e c1474e) {
        if (point != null && point2 != null) {
            p(path, point, c1474e);
            if (c1474e == null) {
                path.lineTo(Math.max(0, point2.x), Math.max(0, point2.y));
            } else {
                path.lineTo(Math.max(0, h2.a.u(c1474e, point2.x)), Math.max(0, h2.a.u(c1474e, point2.y)));
            }
        }
    }

    public static final void p(Path path, Point point, AbstractC1473d abstractC1473d) {
        j.e(point, "position");
        if (abstractC1473d == null) {
            path.moveTo(Math.max(0, point.x), Math.max(0, point.y));
        } else {
            path.moveTo(Math.max(0, h2.a.u(abstractC1473d, point.x)), Math.max(0, h2.a.u(abstractC1473d, point.y)));
        }
    }

    public static final void q(F3.a aVar, C0965l c0965l, boolean z8, InterfaceC1163b interfaceC1163b) {
        int i4;
        int i8;
        j.e(aVar, "<this>");
        MaterialTextView materialTextView = (MaterialTextView) aVar.f1307h;
        j.e(interfaceC1163b, "actionClickedListener");
        ConstraintLayout constraintLayout = (ConstraintLayout) aVar.f1304e;
        constraintLayout.setOnClickListener(new D2.a(interfaceC1163b, 14, c0965l));
        ImageView imageView = (ImageView) aVar.j;
        if (z8) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        imageView.setVisibility(i4);
        materialTextView.setVisibility(0);
        ((ImageView) aVar.f1305f).setImageResource(c0965l.f11998a);
        materialTextView.setText(c0965l.f11999b);
        MaterialTextView materialTextView2 = (MaterialTextView) aVar.f1306g;
        materialTextView2.setText(c0965l.f12000c);
        TypedValue typedValue = new TypedValue();
        if (c0965l.f12002e) {
            i8 = R.attr.colorError;
        } else {
            i8 = R.attr.colorOnSurfaceVariant;
        }
        constraintLayout.getContext().getTheme().resolveAttribute(i8, typedValue, true);
        materialTextView2.setTextColor(typedValue.data);
        MaterialTextView materialTextView3 = (MaterialTextView) aVar.f1308i;
        String str = c0965l.f12001d;
        if (str != null) {
            materialTextView3.setText(str);
            materialTextView3.setVisibility(0);
        } else {
            materialTextView3.setVisibility(8);
        }
    }

    public static final AbstractC0901a r(r rVar, boolean z8) {
        AbstractC0640c c0639b;
        int i4;
        Rect rect;
        boolean z9;
        j.e(rVar, "<this>");
        long j = rVar.f5614b;
        long j5 = rVar.f5613a;
        int ordinal = rVar.f5616d.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        C0999a c0999a = new C0999a(j5, z8);
                        C0999a c0999a2 = new C0999a(j, z8);
                        String str = rVar.f5615c;
                        Long l6 = rVar.f5634x;
                        j.b(l6);
                        long longValue = l6.longValue();
                        Boolean bool = rVar.f5635y;
                        j.b(bool);
                        return new j2.f(c0999a, c0999a2, str, longValue, bool.booleanValue());
                    }
                    throw new IllegalArgumentException("Unsupported condition type for a TriggerCondition");
                }
                C0999a c0999a3 = new C0999a(j5, z8);
                C0999a c0999a4 = new C0999a(j, z8);
                String str2 = rVar.f5615c;
                int i8 = rVar.f5617e;
                String str3 = rVar.f5618f;
                j.b(str3);
                Integer num = rVar.f5619g;
                j.b(num);
                int intValue = num.intValue();
                Integer num2 = rVar.f5620h;
                j.b(num2);
                int intValue2 = num2.intValue();
                Integer num3 = rVar.f5621i;
                j.b(num3);
                int intValue3 = num3.intValue();
                Integer num4 = rVar.j;
                j.b(num4);
                Rect rect2 = new Rect(intValue, intValue2, intValue3, num4.intValue());
                Integer num5 = rVar.k;
                j.b(num5);
                int intValue4 = num5.intValue();
                Integer num6 = rVar.f5622l;
                j.b(num6);
                int intValue5 = num6.intValue();
                Integer num7 = rVar.f5624n;
                Integer num8 = rVar.f5627q;
                Integer num9 = rVar.f5626p;
                Integer num10 = rVar.f5625o;
                if (num7 != null && num10 != null && num9 != null && num8 != null) {
                    rect = new Rect(num7.intValue(), num10.intValue(), num9.intValue(), num8.intValue());
                } else {
                    rect = null;
                }
                Rect rect3 = rect;
                Boolean bool2 = rVar.f5623m;
                if (bool2 != null) {
                    z9 = bool2.booleanValue();
                } else {
                    z9 = true;
                }
                return new C0902b(c0999a3, c0999a4, str2, i8, str3, rect2, intValue4, intValue5, z9, rect3);
            }
            C0999a c0999a5 = new C0999a(j5, z8);
            C0999a c0999a6 = new C0999a(j, z8);
            String str4 = rVar.f5615c;
            String str5 = rVar.f5629s;
            j.b(str5);
            t tVar = rVar.f5630t;
            j.b(tVar);
            EnumC0904d valueOf = EnumC0904d.valueOf(tVar.name());
            T1.u uVar = rVar.f5631u;
            Integer num11 = rVar.f5632v;
            String str6 = rVar.f5633w;
            if (uVar == null) {
                uVar = T1.u.f5647d;
            }
            int ordinal2 = uVar.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    if (str6 == null) {
                        str6 = "";
                    }
                    c0639b = new C0638a(str6);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (num11 != null) {
                    i4 = num11.intValue();
                } else {
                    i4 = 0;
                }
                c0639b = new C0639b(i4);
            }
            return new C0905e(c0999a5, c0999a6, str4, str5, valueOf, c0639b);
        }
        C0999a c0999a7 = new C0999a(j5, z8);
        C0999a c0999a8 = new C0999a(j, z8);
        String str7 = rVar.f5615c;
        String str8 = rVar.f5628r;
        j.b(str8);
        return new C0903c(c0999a7, c0999a8, str7, str8);
    }

    public abstract String a();

    public abstract void b(c cVar, Object obj);

    public abstract String g();

    public void l(D0.a aVar, Object obj) {
        j.e(aVar, "connection");
        if (obj == null) {
            return;
        }
        c L8 = aVar.L(g());
        try {
            b(L8, obj);
            L8.H();
            d(L8, null);
            AbstractC0405a.R(aVar);
        } finally {
        }
    }

    public void m(D0.a aVar, Iterable iterable) {
        j.e(aVar, "connection");
        if (iterable == null) {
            return;
        }
        c L8 = aVar.L(g());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    b(L8, obj);
                    L8.H();
                    L8.reset();
                    AbstractC0405a.R(aVar);
                }
            }
            d(L8, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                d(L8, th);
                throw th2;
            }
        }
    }
}
