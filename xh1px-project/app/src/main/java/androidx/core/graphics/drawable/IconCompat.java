package androidx.core.graphics.drawable;

import I.a;
import Z.g;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f8558b;
    public String j;

    /* renamed from: a, reason: collision with root package name */
    public int f8557a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f8559c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f8560d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f8561e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f8562f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f8563g = null;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f8564h = k;

    /* renamed from: i, reason: collision with root package name */
    public String f8565i = null;

    public static Bitmap a(Bitmap bitmap, boolean z8) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f8 = min;
        float f9 = 0.5f * f8;
        float f10 = 0.9166667f * f9;
        if (z8) {
            float f11 = 0.010416667f * f8;
            paint.setColor(0);
            paint.setShadowLayer(f11, 0.0f, f8 * 0.020833334f, 1023410176);
            canvas.drawCircle(f9, f9, f10, paint);
            paint.setShadowLayer(f11, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f9, f9, f10, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f9, f9, f10, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.graphics.drawable.IconCompat, androidx.versionedparcelable.CustomVersionedParcelable] */
    public static IconCompat b(Resources resources, String str, int i4) {
        str.getClass();
        if (i4 != 0) {
            ?? customVersionedParcelable = new CustomVersionedParcelable();
            customVersionedParcelable.f8559c = null;
            customVersionedParcelable.f8560d = null;
            customVersionedParcelable.f8562f = 0;
            customVersionedParcelable.f8563g = null;
            customVersionedParcelable.f8564h = k;
            customVersionedParcelable.f8565i = null;
            customVersionedParcelable.f8557a = 2;
            customVersionedParcelable.f8561e = i4;
            if (resources != null) {
                try {
                    customVersionedParcelable.f8558b = resources.getResourceName(i4);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                customVersionedParcelable.f8558b = str;
            }
            customVersionedParcelable.j = str;
            return customVersionedParcelable;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public final int c() {
        int i4 = this.f8557a;
        if (i4 == -1) {
            int i8 = Build.VERSION.SDK_INT;
            Object obj = this.f8558b;
            if (i8 >= 28) {
                return a.b(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e9) {
                Log.e("IconCompat", "Unable to get icon resource", e9);
                return 0;
            } catch (NoSuchMethodException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            }
        }
        if (i4 == 2) {
            return this.f8561e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final Uri d() {
        int i4 = this.f8557a;
        if (i4 == -1) {
            int i8 = Build.VERSION.SDK_INT;
            Object obj = this.f8558b;
            if (i8 >= 28) {
                return a.k(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e9) {
                Log.e("IconCompat", "Unable to get icon uri", e9);
                return null;
            } catch (NoSuchMethodException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            }
        }
        if (i4 != 4 && i4 != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.f8558b);
    }

    public final String toString() {
        String str;
        if (this.f8557a == -1) {
            return String.valueOf(this.f8558b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f8557a) {
            case 1:
                str = "BITMAP";
                break;
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESOURCE";
                break;
            case g.INTEGER_FIELD_NUMBER /* 3 */:
                str = "DATA";
                break;
            case g.LONG_FIELD_NUMBER /* 4 */:
                str = "URI";
                break;
            case g.STRING_FIELD_NUMBER /* 5 */:
                str = "BITMAP_MASKABLE";
                break;
            case g.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f8557a) {
            case 1:
            case g.STRING_FIELD_NUMBER /* 5 */:
                sb.append(" size=");
                sb.append(((Bitmap) this.f8558b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f8558b).getHeight());
                break;
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                sb.append(" pkg=");
                sb.append(this.j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case g.INTEGER_FIELD_NUMBER /* 3 */:
                sb.append(" len=");
                sb.append(this.f8561e);
                if (this.f8562f != 0) {
                    sb.append(" off=");
                    sb.append(this.f8562f);
                    break;
                }
                break;
            case g.LONG_FIELD_NUMBER /* 4 */:
            case g.STRING_SET_FIELD_NUMBER /* 6 */:
                sb.append(" uri=");
                sb.append(this.f8558b);
                break;
        }
        if (this.f8563g != null) {
            sb.append(" tint=");
            sb.append(this.f8563g);
        }
        if (this.f8564h != k) {
            sb.append(" mode=");
            sb.append(this.f8564h);
        }
        sb.append(")");
        return sb.toString();
    }
}
