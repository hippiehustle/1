package o;

import a.AbstractC0405a;
import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import e0.C0634b;
import h.AbstractC0805a;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: o.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1174B {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f13039d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13040a = 2;

    /* renamed from: b, reason: collision with root package name */
    public View f13041b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13042c;

    public /* synthetic */ C1174B() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((R3.r) ((W0.c) this.f13042c).f6486e).getClass();
            if (keyListener instanceof e0.e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new e0.e(keyListener);
        }
        return keyListener;
    }

    public void b(AttributeSet attributeSet, int i4) {
        switch (this.f13040a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f13041b;
                R.g J6 = R.g.J(absSeekBar.getContext(), attributeSet, f13039d, i4);
                Drawable B8 = J6.B(0);
                if (B8 != null) {
                    if (B8 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) B8;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i8 = 0; i8 < numberOfFrames; i8++) {
                            Drawable e9 = e(animationDrawable.getFrame(i8), true);
                            e9.setLevel(10000);
                            animationDrawable2.addFrame(e9, animationDrawable.getDuration(i8));
                        }
                        animationDrawable2.setLevel(10000);
                        B8 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(B8);
                }
                Drawable B9 = J6.B(1);
                if (B9 != null) {
                    absSeekBar.setProgressDrawable(e(B9, false));
                }
                J6.L();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f13041b).getContext().obtainStyledAttributes(attributeSet, AbstractC0805a.f11283i, i4, 0);
                try {
                    boolean z8 = true;
                    if (obtainStyledAttributes.hasValue(14)) {
                        z8 = obtainStyledAttributes.getBoolean(14, true);
                    }
                    obtainStyledAttributes.recycle();
                    d(z8);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public C0634b c(InputConnection inputConnection, EditorInfo editorInfo) {
        W0.c cVar = (W0.c) this.f13042c;
        if (inputConnection == null) {
            cVar.getClass();
            inputConnection = null;
        } else {
            R3.r rVar = (R3.r) cVar.f6486e;
            rVar.getClass();
            if (!(inputConnection instanceof C0634b)) {
                inputConnection = new C0634b((EditText) rVar.f5082e, inputConnection, editorInfo);
            }
        }
        return (C0634b) inputConnection;
    }

    public void d(boolean z8) {
        e0.i iVar = (e0.i) ((R3.r) ((W0.c) this.f13042c).f6486e).f5083f;
        if (iVar.f10592f != z8) {
            if (iVar.f10591e != null) {
                c0.k a3 = c0.k.a();
                e0.h hVar = iVar.f10591e;
                a3.getClass();
                AbstractC0405a.l(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a3.f9385a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a3.f9386b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f10592f = z8;
            if (z8) {
                e0.i.a(iVar.f10590d, c0.k.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z8) {
        boolean z9;
        if (drawable instanceof I.c) {
            ((I.d) ((I.c) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i4 = 0; i4 < numberOfLayers; i4++) {
                    int id = layerDrawable.getId(i4);
                    Drawable drawable2 = layerDrawable.getDrawable(i4);
                    if (id != 16908301 && id != 16908303) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    drawableArr[i4] = e(drawable2, z9);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i8 = 0; i8 < numberOfLayers; i8++) {
                    layerDrawable2.setId(i8, layerDrawable.getId(i8));
                    layerDrawable2.setLayerGravity(i8, layerDrawable.getLayerGravity(i8));
                    layerDrawable2.setLayerWidth(i8, layerDrawable.getLayerWidth(i8));
                    layerDrawable2.setLayerHeight(i8, layerDrawable.getLayerHeight(i8));
                    layerDrawable2.setLayerInsetLeft(i8, layerDrawable.getLayerInsetLeft(i8));
                    layerDrawable2.setLayerInsetRight(i8, layerDrawable.getLayerInsetRight(i8));
                    layerDrawable2.setLayerInsetTop(i8, layerDrawable.getLayerInsetTop(i8));
                    layerDrawable2.setLayerInsetBottom(i8, layerDrawable.getLayerInsetBottom(i8));
                    layerDrawable2.setLayerInsetStart(i8, layerDrawable.getLayerInsetStart(i8));
                    layerDrawable2.setLayerInsetEnd(i8, layerDrawable.getLayerInsetEnd(i8));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f13042c) == null) {
                    this.f13042c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                if (z8) {
                    return new ClipDrawable(shapeDrawable, 3, 1);
                }
                return shapeDrawable;
            }
        }
        return drawable;
    }

    public C1174B(AbsSeekBar absSeekBar) {
        this.f13041b = absSeekBar;
    }

    public C1174B(EditText editText) {
        this.f13041b = editText;
        this.f13042c = new W0.c(editText);
    }
}
