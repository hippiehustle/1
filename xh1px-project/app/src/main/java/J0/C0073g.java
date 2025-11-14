package J0;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.buzbuz.smartautoclicker.R;
import java.util.HashMap;

/* renamed from: J0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0073g extends p {

    /* renamed from: G, reason: collision with root package name */
    public static final String[] f2290G = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: F, reason: collision with root package name */
    public final int f2291F;

    public C0073g(int i4) {
        this();
        this.f2291F = i4;
    }

    public static void L(x xVar) {
        int visibility = xVar.f2345b.getVisibility();
        HashMap hashMap = xVar.f2344a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = xVar.f2345b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float N(x xVar, float f8) {
        Float f9;
        if (xVar != null && (f9 = (Float) xVar.f2344a.get("android:fade:transitionAlpha")) != null) {
            return f9.floatValue();
        }
        return f8;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /* JADX WARN: Type inference failed for: r0v0, types: [J0.I, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static I O(x xVar, x xVar2) {
        ?? obj = new Object();
        obj.f2263a = false;
        obj.f2264b = false;
        if (xVar != null) {
            HashMap hashMap = xVar.f2344a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                obj.f2265c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                obj.f2267e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (xVar2 != null) {
                    HashMap hashMap2 = xVar2.f2344a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        obj.f2266d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        obj.f2268f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (xVar == null && xVar2 != null) {
                            int i4 = obj.f2265c;
                            int i8 = obj.f2266d;
                            if (i4 != i8 || obj.f2267e != obj.f2268f) {
                                if (i4 != i8) {
                                    if (i4 == 0) {
                                        obj.f2264b = false;
                                        obj.f2263a = true;
                                        return obj;
                                    }
                                    if (i8 == 0) {
                                        obj.f2264b = true;
                                        obj.f2263a = true;
                                        return obj;
                                    }
                                } else {
                                    if (obj.f2268f == null) {
                                        obj.f2264b = false;
                                        obj.f2263a = true;
                                        return obj;
                                    }
                                    if (obj.f2267e == null) {
                                        obj.f2264b = true;
                                        obj.f2263a = true;
                                        return obj;
                                    }
                                }
                            }
                        } else {
                            if (xVar != null && obj.f2266d == 0) {
                                obj.f2264b = true;
                                obj.f2263a = true;
                                return obj;
                            }
                            if (xVar2 == null && obj.f2265c == 0) {
                                obj.f2264b = false;
                                obj.f2263a = true;
                            }
                        }
                        return obj;
                    }
                }
                obj.f2266d = -1;
                obj.f2268f = null;
                if (xVar == null) {
                }
                if (xVar != null) {
                }
                if (xVar2 == null) {
                    obj.f2264b = false;
                    obj.f2263a = true;
                }
                return obj;
            }
        }
        obj.f2265c = -1;
        obj.f2267e = null;
        if (xVar2 != null) {
        }
        obj.f2266d = -1;
        obj.f2268f = null;
        if (xVar == null) {
        }
        if (xVar != null) {
        }
        if (xVar2 == null) {
        }
        return obj;
    }

    public final ObjectAnimator M(View view, float f8, float f9) {
        if (f8 == f9) {
            return null;
        }
        z.f2347a.t0(view, f8);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, z.f2348b, f9);
        C0072f c0072f = new C0072f(view);
        ofFloat.addListener(c0072f);
        o().a(c0072f);
        return ofFloat;
    }

    @Override // J0.p
    public final void d(x xVar) {
        L(xVar);
    }

    @Override // J0.p
    public final void g(x xVar) {
        L(xVar);
        View view = xVar.f2345b;
        Float f8 = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f8 == null) {
            if (view.getVisibility() == 0) {
                f8 = Float.valueOf(z.f2347a.S(view));
            } else {
                f8 = Float.valueOf(0.0f);
            }
        }
        xVar.f2344a.put("android:fade:transitionAlpha", f8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (O(n(r3, false), r(r3, false)).f2263a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e0  */
    @Override // J0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator k(ViewGroup viewGroup, x xVar, x xVar2) {
        View view;
        boolean z8;
        View view2;
        int i4;
        char c6;
        int i8;
        View view3;
        Animator animator;
        View view4;
        boolean z9;
        boolean z10;
        ViewGroup viewGroup2;
        int i9;
        Bitmap bitmap;
        I O8 = O(xVar, xVar2);
        if (O8.f2263a && (O8.f2267e != null || O8.f2268f != null)) {
            boolean z11 = O8.f2264b;
            int i10 = this.f2291F;
            int i11 = 1;
            if (z11) {
                if ((i10 & 1) == 1 && xVar2 != null) {
                    View view5 = xVar2.f2345b;
                    if (xVar == null) {
                        View view6 = (View) view5.getParent();
                    }
                    z.f2347a.getClass();
                    return M(view5, N(xVar, 0.0f), 1.0f);
                }
            } else {
                int i12 = O8.f2266d;
                if ((i10 & 2) == 2 && xVar != null) {
                    View view7 = xVar.f2345b;
                    if (xVar2 != null) {
                        view = xVar2.f2345b;
                    } else {
                        view = null;
                    }
                    View view8 = (View) view7.getTag(R.id.save_overlay_view);
                    if (view8 != null) {
                        i4 = i12;
                        c6 = 1;
                        i8 = 0;
                        view4 = null;
                        animator = null;
                    } else {
                        if (view != null && view.getParent() != null) {
                            if (i12 == 4 || view7 == view) {
                                z8 = false;
                                view2 = view;
                                view = null;
                                if (z8) {
                                }
                                i4 = i12;
                                c6 = 1;
                                i8 = 0;
                                view3 = view2;
                                animator = null;
                                view8 = view;
                                i11 = i8;
                                view4 = view3;
                            }
                        } else if (view != null) {
                            z8 = false;
                            view2 = null;
                            if (z8) {
                                if (view7.getParent() == null) {
                                    i4 = i12;
                                    c6 = 1;
                                    i11 = 0;
                                    i8 = 0;
                                    view4 = view2;
                                    animator = null;
                                    view8 = view7;
                                } else if (view7.getParent() instanceof View) {
                                    View view9 = (View) view7.getParent();
                                    animator = null;
                                    i8 = 0;
                                    if (!O(r(view9, true), n(view9, true)).f2263a) {
                                        boolean z12 = w.f2343a;
                                        Matrix matrix = new Matrix();
                                        matrix.setTranslate(-view9.getScrollX(), -view9.getScrollY());
                                        E e9 = z.f2347a;
                                        e9.N0(view7, matrix);
                                        e9.O0(viewGroup, matrix);
                                        RectF rectF = new RectF(0.0f, 0.0f, view7.getWidth(), view7.getHeight());
                                        matrix.mapRect(rectF);
                                        int round = Math.round(rectF.left);
                                        int round2 = Math.round(rectF.top);
                                        c6 = 1;
                                        int round3 = Math.round(rectF.right);
                                        int round4 = Math.round(rectF.bottom);
                                        ImageView imageView = new ImageView(view7.getContext());
                                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                        boolean isAttachedToWindow = view7.isAttachedToWindow();
                                        if (viewGroup != null && viewGroup.isAttachedToWindow()) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        if (!isAttachedToWindow) {
                                            if (!z9) {
                                                i4 = i12;
                                                view3 = view2;
                                                bitmap = null;
                                                if (bitmap != null) {
                                                    imageView.setImageBitmap(bitmap);
                                                }
                                                imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                                imageView.layout(round, round2, round3, round4);
                                                view8 = imageView;
                                                i11 = i8;
                                                view4 = view3;
                                            } else {
                                                viewGroup2 = (ViewGroup) view7.getParent();
                                                int indexOfChild = viewGroup2.indexOfChild(view7);
                                                z10 = isAttachedToWindow;
                                                viewGroup.getOverlay().add(view7);
                                                i9 = indexOfChild;
                                            }
                                        } else {
                                            z10 = isAttachedToWindow;
                                            viewGroup2 = null;
                                            i9 = 0;
                                        }
                                        view3 = view2;
                                        int round5 = Math.round(rectF.width());
                                        i4 = i12;
                                        int round6 = Math.round(rectF.height());
                                        if (round5 > 0 && round6 > 0) {
                                            float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                            int round7 = Math.round(round5 * min);
                                            int round8 = Math.round(round6 * min);
                                            matrix.postTranslate(-rectF.left, -rectF.top);
                                            matrix.postScale(min, min);
                                            if (w.f2343a) {
                                                Picture picture = new Picture();
                                                Canvas beginRecording = picture.beginRecording(round7, round8);
                                                beginRecording.concat(matrix);
                                                view7.draw(beginRecording);
                                                picture.endRecording();
                                                bitmap = v.a(picture);
                                            } else {
                                                bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                                                Canvas canvas = new Canvas(bitmap);
                                                canvas.concat(matrix);
                                                view7.draw(canvas);
                                            }
                                        } else {
                                            bitmap = null;
                                        }
                                        if (!z10) {
                                            viewGroup.getOverlay().remove(view7);
                                            viewGroup2.addView(view7, i9);
                                        }
                                        if (bitmap != null) {
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                        imageView.layout(round, round2, round3, round4);
                                        view8 = imageView;
                                        i11 = i8;
                                        view4 = view3;
                                    } else {
                                        i4 = i12;
                                        c6 = 1;
                                        view3 = view2;
                                        int id = view9.getId();
                                        if (view9.getParent() == null && id != -1) {
                                            viewGroup.findViewById(id);
                                        }
                                        view8 = view;
                                        i11 = i8;
                                        view4 = view3;
                                    }
                                }
                            }
                            i4 = i12;
                            c6 = 1;
                            i8 = 0;
                            view3 = view2;
                            animator = null;
                            view8 = view;
                            i11 = i8;
                            view4 = view3;
                        }
                        z8 = true;
                        view = null;
                        view2 = null;
                        if (z8) {
                        }
                        i4 = i12;
                        c6 = 1;
                        i8 = 0;
                        view3 = view2;
                        animator = null;
                        view8 = view;
                        i11 = i8;
                        view4 = view3;
                    }
                    if (view8 != null) {
                        if (i11 == 0) {
                            int[] iArr = (int[]) xVar.f2344a.get("android:visibility:screenLocation");
                            int i13 = iArr[i8];
                            int i14 = iArr[c6];
                            int[] iArr2 = new int[2];
                            viewGroup.getLocationOnScreen(iArr2);
                            view8.offsetLeftAndRight((i13 - iArr2[i8]) - view8.getLeft());
                            view8.offsetTopAndBottom((i14 - iArr2[c6]) - view8.getTop());
                            viewGroup.getOverlay().add(view8);
                        }
                        E e10 = z.f2347a;
                        e10.getClass();
                        ObjectAnimator M8 = M(view8, N(xVar, 1.0f), 0.0f);
                        if (M8 == null) {
                            e10.t0(view8, N(xVar2, 1.0f));
                        }
                        if (i11 == 0) {
                            if (M8 == null) {
                                viewGroup.getOverlay().remove(view8);
                                return M8;
                            }
                            view7.setTag(R.id.save_overlay_view, view8);
                            H h8 = new H(this, viewGroup, view8, view7);
                            M8.addListener(h8);
                            M8.addPauseListener(h8);
                            o().a(h8);
                        }
                        return M8;
                    }
                    if (view4 != null) {
                        int visibility = view4.getVisibility();
                        z.b(view4, i8);
                        E e11 = z.f2347a;
                        e11.getClass();
                        ObjectAnimator M9 = M(view4, N(xVar, 1.0f), 0.0f);
                        if (M9 == null) {
                            e11.t0(view4, N(xVar2, 1.0f));
                        }
                        if (M9 != null) {
                            G g8 = new G(view4, i4);
                            M9.addListener(g8);
                            o().a(g8);
                            return M9;
                        }
                        z.b(view4, visibility);
                        return M9;
                    }
                    return animator;
                }
            }
        }
        return null;
    }

    @Override // J0.p
    public final String[] q() {
        return f2290G;
    }

    @Override // J0.p
    public final boolean t(x xVar, x xVar2) {
        if (xVar != null || xVar2 != null) {
            if (xVar == null || xVar2 == null || xVar2.f2344a.containsKey("android:visibility:visibility") == xVar.f2344a.containsKey("android:visibility:visibility")) {
                I O8 = O(xVar, xVar2);
                if (O8.f2263a) {
                    if (O8.f2265c == 0 || O8.f2266d == 0) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public C0073g() {
        this.f2291F = 3;
    }
}
