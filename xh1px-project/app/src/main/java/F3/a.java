package F3;

import C6.AbstractC0021w;
import C6.O;
import F6.B;
import F6.C;
import I6.AbstractC0065d;
import P.S;
import R3.r;
import Y6.o;
import Y6.p;
import Z.g;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import a6.s;
import a7.C0439A;
import a7.C0447h;
import a7.C0453n;
import a7.C0460v;
import a7.EnumC0449j;
import a7.I;
import a7.T;
import a7.Y;
import a7.b0;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import c7.AbstractC0586e;
import c7.C0587f;
import c7.InterfaceC0588g;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.slider.Slider;
import com.google.android.material.textview.MaterialTextView;
import f7.C0722b;
import f7.C0725e;
import g7.AbstractC0793b;
import g7.AbstractC0803l;
import g7.C0799h;
import g7.n;
import i0.C0878a;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import k7.y;
import n1.AbstractC1149a;
import n6.InterfaceC1164c;
import o.C1216u;
import o.L0;
import o.a1;
import o.p1;
import o6.j;
import q4.X;
import s3.AbstractC1492c;
import s7.InterfaceC1510a;
import s7.InterfaceC1512c;
import s7.t;
import s7.v;
import w7.AbstractC1759v;
import x.AbstractC1769h;
import y6.AbstractC1841a;

/* loaded from: classes.dex */
public final class a implements M0.a, InterfaceC1510a, InterfaceC1512c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1303d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1304e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1305f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1306g;

    /* renamed from: h, reason: collision with root package name */
    public Object f1307h;

    /* renamed from: i, reason: collision with root package name */
    public Object f1308i;
    public Object j;

    public /* synthetic */ a(ViewGroup viewGroup, View view, View view2, View view3, View view4, View view5, int i4) {
        this.f1303d = i4;
        this.f1304e = viewGroup;
        this.f1306g = view;
        this.f1307h = view2;
        this.f1308i = view3;
        this.f1305f = view4;
        this.j = view5;
    }

    public static void A(Drawable drawable, int i4, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C1216u.f13388b;
        }
        mutate.setColorFilter(C1216u.c(i4, mode));
    }

    public static final k7.g a(a aVar, C0725e c0725e, Object obj) {
        k7.g b4 = k7.h.b((C) aVar.f1307h, obj);
        if (b4 == null) {
            String str = "Unsupported annotation argument: " + c0725e;
            o6.j.e(str, "message");
            return new k7.j(str);
        }
        return b4;
    }

    public static boolean c(int[] iArr, int i4) {
        for (int i8 : iArr) {
            if (i8 == i4) {
                return true;
            }
        }
        return false;
    }

    public static a i(View view) {
        int i4 = R.id.condition_detection_type;
        ImageView imageView = (ImageView) E2.b.r(view, R.id.condition_detection_type);
        if (imageView != null) {
            i4 = R.id.condition_image;
            ImageView imageView2 = (ImageView) E2.b.r(view, R.id.condition_image);
            if (imageView2 != null) {
                i4 = R.id.condition_name;
                MaterialTextView materialTextView = (MaterialTextView) E2.b.r(view, R.id.condition_name);
                if (materialTextView != null) {
                    i4 = R.id.condition_should_be_detected;
                    ImageView imageView3 = (ImageView) E2.b.r(view, R.id.condition_should_be_detected);
                    if (imageView3 != null) {
                        i4 = R.id.condition_threshold;
                        MaterialTextView materialTextView2 = (MaterialTextView) E2.b.r(view, R.id.condition_threshold);
                        if (materialTextView2 != null) {
                            i4 = R.id.divider;
                            if (((MaterialDivider) E2.b.r(view, R.id.divider)) != null) {
                                return new a((ConstraintLayout) view, imageView, imageView2, materialTextView, imageView3, materialTextView2, 3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    public static ColorStateList m(Context context, int i4) {
        int c6 = a1.c(context, R.attr.colorControlHighlight);
        int b4 = a1.b(context, R.attr.colorButtonNormal);
        int[] iArr = a1.f13226b;
        int[] iArr2 = a1.f13228d;
        int c9 = H.b.c(c6, i4);
        return new ColorStateList(new int[][]{iArr, iArr2, a1.f13227c, a1.f13230f}, new int[]{b4, c9, H.b.c(c6, i4), i4});
    }

    public static /* synthetic */ List q(a aVar, v vVar, p pVar, Boolean bool, boolean z8, int i4) {
        boolean z9;
        boolean z10;
        if ((i4 & 4) != 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        if ((i4 & 16) != 0) {
            bool = null;
        }
        Boolean bool2 = bool;
        if ((i4 & 32) != 0) {
            z10 = false;
        } else {
            z10 = z8;
        }
        return aVar.o(vVar, pVar, z9, false, bool2, z10);
    }

    public static p r(AbstractC0793b abstractC0793b, InterfaceC0588g interfaceC0588g, B b4, int i4, boolean z8) {
        o6.j.e(abstractC0793b, "proto");
        o6.j.e(interfaceC0588g, "nameResolver");
        AbstractC1149a.l("kind", i4);
        if (abstractC0793b instanceof C0453n) {
            C0799h c0799h = e7.g.f10671a;
            e7.e a3 = e7.g.a((C0453n) abstractC0793b, interfaceC0588g, b4);
            if (a3 != null) {
                return AbstractC1492c.l(a3);
            }
        } else if (abstractC0793b instanceof C0439A) {
            C0799h c0799h2 = e7.g.f10671a;
            e7.e c6 = e7.g.c((C0439A) abstractC0793b, interfaceC0588g, b4);
            if (c6 != null) {
                return AbstractC1492c.l(c6);
            }
        } else if (abstractC0793b instanceof I) {
            n nVar = d7.k.f10515d;
            o6.j.d(nVar, "propertySignature");
            d7.e eVar = (d7.e) E2.d.t((AbstractC0803l) abstractC0793b, nVar);
            if (eVar != null) {
                int b9 = AbstractC1769h.b(i4);
                if (b9 != 1) {
                    if (b9 != 2) {
                        if (b9 != 3 || (eVar.f10475e & 8) != 8) {
                            return null;
                        }
                        d7.c cVar = eVar.f10479i;
                        o6.j.d(cVar, "getSetter(...)");
                        return new p(interfaceC0588g.getString(cVar.f10463f).concat(interfaceC0588g.getString(cVar.f10464g)));
                    }
                    if (eVar.i()) {
                        d7.c cVar2 = eVar.f10478h;
                        o6.j.d(cVar2, "getGetter(...)");
                        return new p(interfaceC0588g.getString(cVar2.f10463f).concat(interfaceC0588g.getString(cVar2.f10464g)));
                    }
                } else {
                    return E2.d.w((I) abstractC0793b, interfaceC0588g, b4, true, true, z8);
                }
            }
        }
        return null;
    }

    public static LayerDrawable s(L0 l02, Context context, int i4) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i4);
        Drawable c6 = l02.c(context, R.drawable.abc_star_black_48dp);
        Drawable c9 = l02.c(context, R.drawable.abc_star_half_black_48dp);
        if ((c6 instanceof BitmapDrawable) && c6.getIntrinsicWidth() == dimensionPixelSize && c6.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) c6;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c6.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c6.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((c9 instanceof BitmapDrawable) && c9.getIntrinsicWidth() == dimensionPixelSize && c9.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c9;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c9.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c9.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static a u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.item_dumb_action, viewGroup, false);
        int i4 = R.id.action_duration;
        MaterialTextView materialTextView = (MaterialTextView) E2.b.r(inflate, R.id.action_duration);
        if (materialTextView != null) {
            i4 = R.id.action_name;
            MaterialTextView materialTextView2 = (MaterialTextView) E2.b.r(inflate, R.id.action_name);
            if (materialTextView2 != null) {
                i4 = R.id.action_repeat;
                MaterialTextView materialTextView3 = (MaterialTextView) E2.b.r(inflate, R.id.action_repeat);
                if (materialTextView3 != null) {
                    i4 = R.id.action_type_icon;
                    ImageView imageView = (ImageView) E2.b.r(inflate, R.id.action_type_icon);
                    if (imageView != null) {
                        i4 = R.id.btn_reorder;
                        ImageView imageView2 = (ImageView) E2.b.r(inflate, R.id.btn_reorder);
                        if (imageView2 != null) {
                            return new a((ConstraintLayout) inflate, materialTextView, materialTextView2, materialTextView3, imageView, imageView2, 8);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // s7.InterfaceC1512c
    public ArrayList b(t tVar) {
        o oVar;
        o6.j.e(tVar, "container");
        O o7 = tVar.f14630c;
        H6.b bVar = null;
        if (o7 instanceof o) {
            oVar = (o) o7;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            bVar = oVar.f7236d;
        }
        if (bVar != null) {
            ArrayList arrayList = new ArrayList(1);
            Class cls = bVar.f2037a;
            o6.j.e(cls, "klass");
            S g8 = o6.j.g(cls.getDeclaredAnnotations());
            while (g8.hasNext()) {
                Annotation annotation = (Annotation) g8.next();
                o6.j.b(annotation);
                Class k = h2.a.k(h2.a.g(annotation));
                p1 x8 = x(AbstractC0065d.a(k), new H6.a(annotation), arrayList);
                if (x8 != null) {
                    X.I(x8, annotation, k);
                }
            }
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + tVar.f14624f.a()).toString());
    }

    @Override // s7.InterfaceC1512c
    public ArrayList d(Y y4, InterfaceC0588g interfaceC0588g) {
        o6.j.e(y4, "proto");
        o6.j.e(interfaceC0588g, "nameResolver");
        Object k = y4.k(d7.k.f10519h);
        o6.j.d(k, "getExtension(...)");
        Iterable<C0447h> iterable = (Iterable) k;
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(iterable, 10));
        for (C0447h c0447h : iterable) {
            o6.j.b(c0447h);
            arrayList.add(((r) this.f1305f).z(c0447h, interfaceC0588g));
        }
        return arrayList;
    }

    @Override // s7.InterfaceC1512c
    public List e(v vVar, AbstractC0793b abstractC0793b, int i4) {
        o6.j.e(abstractC0793b, "proto");
        AbstractC1149a.l("kind", i4);
        p r8 = r(abstractC0793b, vVar.f14628a, vVar.f14629b, i4, false);
        if (r8 != null) {
            return q(this, vVar, new p(A.j.r(new StringBuilder(), r8.f7237a, "@0")), null, false, 60);
        }
        return s.f7766d;
    }

    @Override // s7.InterfaceC1510a
    public Object f(v vVar, I i4, AbstractC1759v abstractC1759v) {
        o6.j.e(i4, "proto");
        return y(vVar, i4, 3, abstractC1759v, Y6.a.f7203e);
    }

    @Override // s7.InterfaceC1512c
    public List g(v vVar, I i4) {
        o6.j.e(i4, "proto");
        return z(vVar, i4, Y6.b.f7208f);
    }

    @Override // M0.a
    public View getRoot() {
        switch (this.f1303d) {
            case 0:
                return (NestedScrollView) this.f1304e;
            case 1:
                return (NestedScrollView) this.f1304e;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return (LinearLayout) this.f1304e;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return (ConstraintLayout) this.f1304e;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return (MaterialCardView) this.f1304e;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            default:
                return (ConstraintLayout) this.f1304e;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return (NestedScrollView) this.f1304e;
        }
    }

    @Override // s7.InterfaceC1512c
    public List h(v vVar, C0460v c0460v) {
        o6.j.e(vVar, "container");
        String string = vVar.f14628a.getString(c0460v.f8234g);
        String b4 = e7.b.b(((t) vVar).f14624f.b());
        o6.j.e(b4, "desc");
        return q(this, vVar, new p(string + '#' + b4), null, false, 60);
    }

    @Override // s7.InterfaceC1510a
    public Object j(v vVar, I i4, AbstractC1759v abstractC1759v) {
        o6.j.e(i4, "proto");
        return y(vVar, i4, 2, abstractC1759v, Y6.a.f7204f);
    }

    @Override // s7.InterfaceC1512c
    public List k(v vVar, AbstractC0793b abstractC0793b, int i4) {
        o6.j.e(abstractC0793b, "proto");
        AbstractC1149a.l("kind", i4);
        if (i4 == 2) {
            return z(vVar, (I) abstractC0793b, Y6.b.f7206d);
        }
        p r8 = r(abstractC0793b, vVar.f14628a, vVar.f14629b, i4, false);
        if (r8 == null) {
            return s.f7766d;
        }
        return q(this, vVar, r8, null, false, 60);
    }

    @Override // s7.InterfaceC1512c
    public List l(v vVar, I i4) {
        o6.j.e(i4, "proto");
        return z(vVar, i4, Y6.b.f7207e);
    }

    @Override // s7.InterfaceC1512c
    public ArrayList n(T t8, InterfaceC0588g interfaceC0588g) {
        o6.j.e(t8, "proto");
        o6.j.e(interfaceC0588g, "nameResolver");
        Object k = t8.k(d7.k.f10517f);
        o6.j.d(k, "getExtension(...)");
        Iterable<C0447h> iterable = (Iterable) k;
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(iterable, 10));
        for (C0447h c0447h : iterable) {
            o6.j.b(c0447h);
            arrayList.add(((r) this.f1305f).z(c0447h, interfaceC0588g));
        }
        return arrayList;
    }

    public List o(v vVar, p pVar, boolean z8, boolean z9, Boolean bool, boolean z10) {
        List list;
        o oVar;
        H6.b X8 = E2.c.X(vVar, z8, z9, bool, z10, (W0.c) this.f1304e, (C0587f) this.j);
        if (X8 == null) {
            if (vVar instanceof t) {
                O o7 = ((t) vVar).f14630c;
                if (o7 instanceof o) {
                    oVar = (o) o7;
                } else {
                    oVar = null;
                }
                if (oVar != null) {
                    X8 = oVar.f7236d;
                }
            }
            X8 = null;
        }
        if (X8 == null || (list = (List) ((Y6.c) ((v7.e) this.f1306g).m(X8)).f7210a.get(pVar)) == null) {
            return s.f7766d;
        }
        return list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if ((r11 & 64) == 64) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r11.f14626h != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if ((r11 & 64) == 64) goto L11;
     */
    @Override // s7.InterfaceC1512c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List p(v vVar, AbstractC0793b abstractC0793b, int i4, int i8, b0 b0Var) {
        o6.j.e(abstractC0793b, "callableProto");
        AbstractC1149a.l("kind", i4);
        int i9 = 0;
        p r8 = r(abstractC0793b, vVar.f14628a, vVar.f14629b, i4, false);
        if (r8 != null) {
            if (abstractC0793b instanceof C0439A) {
                int i10 = ((C0439A) abstractC0793b).f7779f;
                if ((i10 & 32) != 32) {
                }
                i9 = 1;
            } else if (abstractC0793b instanceof I) {
                int i11 = ((I) abstractC0793b).f7855f;
                if ((i11 & 32) != 32) {
                }
                i9 = 1;
            } else if (abstractC0793b instanceof C0453n) {
                t tVar = (t) vVar;
                if (tVar.f14625g == EnumC0449j.ENUM_CLASS) {
                    i9 = 2;
                }
            } else {
                throw new UnsupportedOperationException("Unsupported message: " + abstractC0793b.getClass());
            }
            return q(this, vVar, new p(r8.f7237a + '@' + (i8 + i9)), null, false, 60);
        }
        return s.f7766d;
    }

    public ColorStateList t(Context context, int i4) {
        if (i4 == R.drawable.abc_edit_text_material) {
            return AbstractC1492c.o(context, R.color.abc_tint_edittext);
        }
        if (i4 == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC1492c.o(context, R.color.abc_tint_switch_track);
        }
        if (i4 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList d2 = a1.d(context, R.attr.colorSwitchThumbNormal);
            if (d2 != null && d2.isStateful()) {
                int[] iArr3 = a1.f13226b;
                iArr[0] = iArr3;
                iArr2[0] = d2.getColorForState(iArr3, 0);
                iArr[1] = a1.f13229e;
                iArr2[1] = a1.c(context, R.attr.colorControlActivated);
                iArr[2] = a1.f13230f;
                iArr2[2] = d2.getDefaultColor();
            } else {
                iArr[0] = a1.f13226b;
                iArr2[0] = a1.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = a1.f13229e;
                iArr2[1] = a1.c(context, R.attr.colorControlActivated);
                iArr[2] = a1.f13230f;
                iArr2[2] = a1.c(context, R.attr.colorSwitchThumbNormal);
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i4 == R.drawable.abc_btn_default_mtrl_shape) {
            return m(context, a1.c(context, R.attr.colorButtonNormal));
        }
        if (i4 == R.drawable.abc_btn_borderless_material) {
            return m(context, 0);
        }
        if (i4 == R.drawable.abc_btn_colored_material) {
            return m(context, a1.c(context, R.attr.colorAccent));
        }
        if (i4 != R.drawable.abc_spinner_mtrl_am_alpha && i4 != R.drawable.abc_spinner_textfield_background_material) {
            if (c((int[]) this.f1306g, i4)) {
                return a1.d(context, R.attr.colorControlNormal);
            }
            if (c((int[]) this.f1305f, i4)) {
                return AbstractC1492c.o(context, R.color.abc_tint_default);
            }
            if (c((int[]) this.j, i4)) {
                return AbstractC1492c.o(context, R.color.abc_tint_btn_checkable);
            }
            if (i4 == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC1492c.o(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        return AbstractC1492c.o(context, R.color.abc_tint_spinner);
    }

    public boolean v(C0722b c0722b) {
        H6.b t8;
        if (c0722b.e() != null && o6.j.a(c0722b.f().b(), "Container") && (t8 = X.t((W0.c) this.f1304e, c0722b, (C0587f) this.j)) != null) {
            LinkedHashSet linkedHashSet = AbstractC1841a.f16513a;
            Class cls = t8.f2037a;
            o6.j.e(cls, "klass");
            S g8 = o6.j.g(cls.getDeclaredAnnotations());
            boolean z8 = false;
            while (g8.hasNext()) {
                Annotation annotation = (Annotation) g8.next();
                o6.j.b(annotation);
                if (AbstractC0065d.a(h2.a.k(h2.a.g(annotation))).equals(P6.v.f4596b)) {
                    z8 = true;
                }
            }
            if (z8) {
                return true;
            }
        }
        return false;
    }

    public p1 w(C0722b c0722b, O o7, List list) {
        o6.j.e(list, "result");
        return new p1(this, AbstractC0021w.f((C) this.f1307h, c0722b, (A4.a) this.f1308i), c0722b, list, o7);
    }

    public p1 x(C0722b c0722b, H6.a aVar, List list) {
        o6.j.e(list, "result");
        if (AbstractC1841a.f16513a.contains(c0722b)) {
            return null;
        }
        return w(c0722b, aVar, list);
    }

    public Object y(v vVar, I i4, int i8, AbstractC1759v abstractC1759v, InterfaceC1164c interfaceC1164c) {
        Object l6;
        o oVar;
        H6.b X8 = E2.c.X(vVar, true, true, AbstractC0586e.f9683B.c(i4.f7856g), e7.g.d(i4), (W0.c) this.f1304e, (C0587f) this.j);
        if (X8 == null) {
            if (vVar instanceof t) {
                O o7 = ((t) vVar).f14630c;
                if (o7 instanceof o) {
                    oVar = (o) o7;
                } else {
                    oVar = null;
                }
                if (oVar != null) {
                    X8 = oVar.f7236d;
                }
            }
            X8 = null;
        }
        if (X8 != null) {
            C0587f c0587f = X8.f2038b.f7518b;
            C0587f c0587f2 = Y6.e.f7217e;
            o6.j.e(c0587f2, "version");
            p r8 = r(i4, vVar.f14628a, vVar.f14629b, i8, c0587f.a(c0587f2.f9675b, c0587f2.f9676c, c0587f2.f9677d));
            if (r8 != null && (l6 = interfaceC1164c.l(((v7.e) this.f1306g).m(X8), r8)) != null) {
                if (z6.r.a(abstractC1759v)) {
                    l6 = (k7.g) l6;
                    if (l6 instanceof k7.d) {
                        return new y(((Number) ((k7.d) l6).f12144a).byteValue());
                    }
                    if (l6 instanceof k7.v) {
                        return new y(((Number) ((k7.v) l6).f12144a).shortValue());
                    }
                    if (l6 instanceof k7.k) {
                        return new y(((Number) ((k7.k) l6).f12144a).intValue());
                    }
                    if (l6 instanceof k7.t) {
                        return new y(((Number) ((k7.t) l6).f12144a).longValue());
                    }
                }
                return l6;
            }
        }
        return null;
    }

    public List z(v vVar, I i4, Y6.b bVar) {
        B b4 = vVar.f14629b;
        InterfaceC0588g interfaceC0588g = vVar.f14628a;
        Boolean c6 = AbstractC0586e.f9683B.c(i4.f7856g);
        boolean d2 = e7.g.d(i4);
        if (bVar == Y6.b.f7206d) {
            p x8 = E2.d.x(i4, interfaceC0588g, b4, 40);
            if (x8 != null) {
                return q(this, vVar, x8, c6, d2, 8);
            }
        } else {
            p x9 = E2.d.x(i4, interfaceC0588g, b4, 48);
            if (x9 != null) {
                boolean z8 = false;
                boolean b02 = I7.m.b0(x9.f7237a, "$delegate", false);
                if (bVar == Y6.b.f7208f) {
                    z8 = true;
                }
                if (b02 == z8) {
                    return o(vVar, x9, true, true, c6, d2);
                }
            }
        }
        return s.f7766d;
    }

    public a(C c6, A4.a aVar, v7.k kVar, W0.c cVar) {
        this.f1303d = 6;
        this.f1303d = 6;
        this.f1304e = cVar;
        this.f1306g = kVar.b(new B6.n(17, this));
        this.f1307h = c6;
        this.f1308i = aVar;
        this.f1305f = new r(c6, aVar);
        this.j = C0587f.f9721g;
    }

    public a(N2.a aVar) {
        this.f1303d = 5;
        int i4 = aVar.f3719a;
        long j = aVar.f3720b;
        long j5 = aVar.f3721c;
        long j8 = aVar.f3722d;
        long j9 = aVar.f3723e;
        final int i8 = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.8f);
        ofFloat.setDuration(j9);
        ofFloat.setInterpolator(new DecelerateInterpolator(2.0f));
        final int i9 = 0;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: N2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ F3.a f3725b;

            {
                this.f3725b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i9) {
                    case 0:
                        j.e(valueAnimator, "it");
                        c cVar = (c) this.f3725b.f1304e;
                        if (cVar != null) {
                            Object animatedValue = valueAnimator.getAnimatedValue();
                            j.c(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                            cVar.m((Float) animatedValue);
                            return;
                        }
                        return;
                    case 1:
                        j.e(valueAnimator, "it");
                        Object animatedValue2 = valueAnimator.getAnimatedValue();
                        j.c(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = ((Integer) animatedValue2).intValue();
                        F3.a aVar2 = this.f3725b;
                        c cVar2 = (c) aVar2.f1306g;
                        if (cVar2 != null) {
                            cVar2.m(Integer.valueOf(intValue));
                        }
                        c cVar3 = (c) aVar2.f1308i;
                        if (cVar3 != null) {
                            cVar3.m(Integer.valueOf(intValue));
                            return;
                        }
                        return;
                    case g.FLOAT_FIELD_NUMBER /* 2 */:
                        j.e(valueAnimator, "it");
                        c cVar4 = (c) this.f3725b.f1307h;
                        if (cVar4 != null) {
                            Object animatedValue3 = valueAnimator.getAnimatedValue();
                            j.c(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
                            cVar4.m((Integer) animatedValue3);
                            return;
                        }
                        return;
                    default:
                        j.e(valueAnimator, "it");
                        c cVar5 = (c) this.f3725b.f1308i;
                        if (cVar5 != null) {
                            Object animatedValue4 = valueAnimator.getAnimatedValue();
                            j.c(animatedValue4, "null cannot be cast to non-null type kotlin.Int");
                            cVar5.m((Integer) animatedValue4);
                            return;
                        }
                        return;
                }
            }
        });
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
        ofInt.setDuration(j8);
        ofInt.setInterpolator(new LinearInterpolator());
        final int i10 = 1;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: N2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ F3.a f3725b;

            {
                this.f3725b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        j.e(valueAnimator, "it");
                        c cVar = (c) this.f3725b.f1304e;
                        if (cVar != null) {
                            Object animatedValue = valueAnimator.getAnimatedValue();
                            j.c(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                            cVar.m((Float) animatedValue);
                            return;
                        }
                        return;
                    case 1:
                        j.e(valueAnimator, "it");
                        Object animatedValue2 = valueAnimator.getAnimatedValue();
                        j.c(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = ((Integer) animatedValue2).intValue();
                        F3.a aVar2 = this.f3725b;
                        c cVar2 = (c) aVar2.f1306g;
                        if (cVar2 != null) {
                            cVar2.m(Integer.valueOf(intValue));
                        }
                        c cVar3 = (c) aVar2.f1308i;
                        if (cVar3 != null) {
                            cVar3.m(Integer.valueOf(intValue));
                            return;
                        }
                        return;
                    case g.FLOAT_FIELD_NUMBER /* 2 */:
                        j.e(valueAnimator, "it");
                        c cVar4 = (c) this.f3725b.f1307h;
                        if (cVar4 != null) {
                            Object animatedValue3 = valueAnimator.getAnimatedValue();
                            j.c(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
                            cVar4.m((Integer) animatedValue3);
                            return;
                        }
                        return;
                    default:
                        j.e(valueAnimator, "it");
                        c cVar5 = (c) this.f3725b.f1308i;
                        if (cVar5 != null) {
                            Object animatedValue4 = valueAnimator.getAnimatedValue();
                            j.c(animatedValue4, "null cannot be cast to non-null type kotlin.Int");
                            cVar5.m((Integer) animatedValue4);
                            return;
                        }
                        return;
                }
            }
        });
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, i4);
        ofInt2.setDuration(j8);
        ofInt2.setInterpolator(new LinearInterpolator());
        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: N2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ F3.a f3725b;

            {
                this.f3725b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i8) {
                    case 0:
                        j.e(valueAnimator, "it");
                        c cVar = (c) this.f3725b.f1304e;
                        if (cVar != null) {
                            Object animatedValue = valueAnimator.getAnimatedValue();
                            j.c(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                            cVar.m((Float) animatedValue);
                            return;
                        }
                        return;
                    case 1:
                        j.e(valueAnimator, "it");
                        Object animatedValue2 = valueAnimator.getAnimatedValue();
                        j.c(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = ((Integer) animatedValue2).intValue();
                        F3.a aVar2 = this.f3725b;
                        c cVar2 = (c) aVar2.f1306g;
                        if (cVar2 != null) {
                            cVar2.m(Integer.valueOf(intValue));
                        }
                        c cVar3 = (c) aVar2.f1308i;
                        if (cVar3 != null) {
                            cVar3.m(Integer.valueOf(intValue));
                            return;
                        }
                        return;
                    case g.FLOAT_FIELD_NUMBER /* 2 */:
                        j.e(valueAnimator, "it");
                        c cVar4 = (c) this.f3725b.f1307h;
                        if (cVar4 != null) {
                            Object animatedValue3 = valueAnimator.getAnimatedValue();
                            j.c(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
                            cVar4.m((Integer) animatedValue3);
                            return;
                        }
                        return;
                    default:
                        j.e(valueAnimator, "it");
                        c cVar5 = (c) this.f3725b.f1308i;
                        if (cVar5 != null) {
                            Object animatedValue4 = valueAnimator.getAnimatedValue();
                            j.c(animatedValue4, "null cannot be cast to non-null type kotlin.Int");
                            cVar5.m((Integer) animatedValue4);
                            return;
                        }
                        return;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        final int i11 = 3;
        animatorSet.playTogether(AbstractC0437l.X(ofFloat, ofInt, ofInt2));
        this.f1305f = animatorSet;
        ValueAnimator ofInt3 = ValueAnimator.ofInt(255, 0);
        ofInt3.setStartDelay(j5);
        ofInt3.setDuration(j);
        ofInt3.setInterpolator(new C0878a(1));
        ofInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: N2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ F3.a f3725b;

            {
                this.f3725b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        j.e(valueAnimator, "it");
                        c cVar = (c) this.f3725b.f1304e;
                        if (cVar != null) {
                            Object animatedValue = valueAnimator.getAnimatedValue();
                            j.c(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                            cVar.m((Float) animatedValue);
                            return;
                        }
                        return;
                    case 1:
                        j.e(valueAnimator, "it");
                        Object animatedValue2 = valueAnimator.getAnimatedValue();
                        j.c(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = ((Integer) animatedValue2).intValue();
                        F3.a aVar2 = this.f3725b;
                        c cVar2 = (c) aVar2.f1306g;
                        if (cVar2 != null) {
                            cVar2.m(Integer.valueOf(intValue));
                        }
                        c cVar3 = (c) aVar2.f1308i;
                        if (cVar3 != null) {
                            cVar3.m(Integer.valueOf(intValue));
                            return;
                        }
                        return;
                    case g.FLOAT_FIELD_NUMBER /* 2 */:
                        j.e(valueAnimator, "it");
                        c cVar4 = (c) this.f3725b.f1307h;
                        if (cVar4 != null) {
                            Object animatedValue3 = valueAnimator.getAnimatedValue();
                            j.c(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
                            cVar4.m((Integer) animatedValue3);
                            return;
                        }
                        return;
                    default:
                        j.e(valueAnimator, "it");
                        c cVar5 = (c) this.f3725b.f1308i;
                        if (cVar5 != null) {
                            Object animatedValue4 = valueAnimator.getAnimatedValue();
                            j.c(animatedValue4, "null cannot be cast to non-null type kotlin.Int");
                            cVar5.m((Integer) animatedValue4);
                            return;
                        }
                        return;
                }
            }
        });
        ofInt3.start();
        this.j = ofInt3;
    }

    public a(LinearLayout linearLayout, A.i iVar, A4.c cVar, A.i iVar2, A4.d dVar, A4.a aVar) {
        this.f1303d = 2;
        this.f1304e = linearLayout;
        this.f1305f = iVar;
        this.f1306g = cVar;
        this.f1307h = iVar2;
        this.f1308i = dVar;
        this.j = aVar;
    }

    public a(NestedScrollView nestedScrollView, A4.a aVar, A4.a aVar2, A4.a aVar3, RecyclerView recyclerView, A.i iVar, A4.a aVar4) {
        this.f1303d = 0;
        this.f1304e = nestedScrollView;
        this.f1306g = aVar;
        this.f1307h = aVar2;
        this.f1308i = aVar3;
        this.f1305f = iVar;
        this.j = aVar4;
    }

    public a() {
        this.f1303d = 9;
        this.f1304e = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.f1306g = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f1307h = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.f1308i = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.f1305f = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.j = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public a(NestedScrollView nestedScrollView, A4.c cVar, A4.c cVar2, A.i iVar, Slider slider, MaterialButton materialButton, MaterialTextView materialTextView, MaterialButton materialButton2) {
        this.f1303d = 1;
        this.f1304e = nestedScrollView;
        this.f1306g = cVar;
        this.f1307h = cVar2;
        this.f1305f = iVar;
        this.f1308i = slider;
        this.j = materialTextView;
    }
}
