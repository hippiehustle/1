package J0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* renamed from: J0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0071e extends p {

    /* renamed from: F, reason: collision with root package name */
    public static final String[] f2283F = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: G, reason: collision with root package name */
    public static final C5.g f2284G = new C5.g(PointF.class, "topLeft", 3);

    /* renamed from: H, reason: collision with root package name */
    public static final C5.g f2285H = new C5.g(PointF.class, "bottomRight", 4);

    /* renamed from: I, reason: collision with root package name */
    public static final C5.g f2286I = new C5.g(PointF.class, "bottomRight", 5);

    /* renamed from: J, reason: collision with root package name */
    public static final C5.g f2287J = new C5.g(PointF.class, "topLeft", 6);
    public static final C5.g K = new C5.g(PointF.class, "position", 7);

    public static void L(x xVar) {
        View view = xVar.f2345b;
        HashMap hashMap = xVar.f2344a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", xVar.f2345b.getParent());
    }

    @Override // J0.p
    public final void d(x xVar) {
        L(xVar);
    }

    @Override // J0.p
    public final void g(x xVar) {
        L(xVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // J0.p
    public final Animator k(ViewGroup viewGroup, x xVar, x xVar2) {
        int i4;
        C0071e c0071e;
        ObjectAnimator a3;
        if (xVar != null) {
            HashMap hashMap = xVar.f2344a;
            if (xVar2 != null) {
                HashMap hashMap2 = xVar2.f2344a;
                ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = xVar2.f2345b;
                    Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
                    int i8 = rect.left;
                    int i9 = rect2.left;
                    int i10 = rect.top;
                    int i11 = rect2.top;
                    int i12 = rect.right;
                    int i13 = rect2.right;
                    int i14 = rect.bottom;
                    int i15 = rect2.bottom;
                    int i16 = i12 - i8;
                    int i17 = i14 - i10;
                    int i18 = i13 - i9;
                    int i19 = i15 - i11;
                    Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
                    if ((i16 != 0 && i17 != 0) || (i18 != 0 && i19 != 0)) {
                        if (i8 == i9 && i10 == i11) {
                            i4 = 0;
                        } else {
                            i4 = 1;
                        }
                        if (i12 != i13 || i14 != i15) {
                            i4++;
                        }
                    } else {
                        i4 = 0;
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i4++;
                    }
                    int i20 = i4;
                    if (i20 > 0) {
                        z.a(view, i8, i10, i12, i14);
                        if (i20 == 2) {
                            if (i16 == i18 && i17 == i19) {
                                c0071e = this;
                                c0071e.f2332y.getClass();
                                a3 = AbstractC0074h.a(view, K, G5.e.s(i8, i10, i9, i11));
                            } else {
                                c0071e = this;
                                C0070d c0070d = new C0070d(view);
                                c0071e.f2332y.getClass();
                                ObjectAnimator a4 = AbstractC0074h.a(c0070d, f2284G, G5.e.s(i8, i10, i9, i11));
                                c0071e.f2332y.getClass();
                                ObjectAnimator a9 = AbstractC0074h.a(c0070d, f2285H, G5.e.s(i12, i14, i13, i15));
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.playTogether(a4, a9);
                                animatorSet.addListener(new C0068b(c0070d));
                                a3 = animatorSet;
                            }
                        } else {
                            c0071e = this;
                            if (i8 == i9 && i10 == i11) {
                                c0071e.f2332y.getClass();
                                a3 = AbstractC0074h.a(view, f2286I, G5.e.s(i12, i14, i13, i15));
                            } else {
                                c0071e.f2332y.getClass();
                                a3 = AbstractC0074h.a(view, f2287J, G5.e.s(i8, i10, i9, i11));
                            }
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            E2.d.T(viewGroup4, true);
                            c0071e.o().a(new C0069c(viewGroup4));
                        }
                        return a3;
                    }
                }
            }
        }
        return null;
    }

    @Override // J0.p
    public final String[] q() {
        return f2283F;
    }
}
